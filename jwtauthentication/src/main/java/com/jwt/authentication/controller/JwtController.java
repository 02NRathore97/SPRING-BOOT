package com.jwt.authentication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.authentication.helper.JwtUtil;
import com.jwt.authentication.model.JwtRequest;
import com.jwt.authentication.model.JwtResponse;
import com.jwt.authentication.services.CustomUserDetailsService;

@RestController

public class JwtController {
	@Autowired
	private JwtUtil jwtUtil;
	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
	private CustomUserDetailsService CustomUserDetailsService;

	@RequestMapping(value = "/token",method =RequestMethod.POST)
	public ResponseEntity<JwtResponse> generateToken(@RequestBody JwtRequest jwtRequest) throws Exception {
	System.out.println(jwtRequest);
		try {
			this.authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(jwtRequest.getUsername(), jwtRequest.getPassword()));

		} catch (BadCredentialsException e) {
			e.printStackTrace();
			throw new Exception("Bad Credentials...............");
		}
		// find area...
		UserDetails userDetails = CustomUserDetailsService.loadUserByUsername(jwtRequest.getUsername());
		System.out.println(userDetails);
		String token = jwtUtil.generateToken(userDetails);
		System.out.println("JWT token = " + token);

		return ResponseEntity.ok(new JwtResponse(token));

	}

}
