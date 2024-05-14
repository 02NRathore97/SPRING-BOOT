package com.spring.springboot.jpa;


import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.springboot.jpa.dao.UserRepository;
import com.spring.springboot.jpa.entities.User;


@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		
		//Saving single user
//		User user = new User();		
		
		
		//first user
//		user.setName("Neeraj Rathore");
//		user.setCity("Indore");
//		user.setStatus("Java Programmer");
//		
//		User user1 = userRepository.save(user);
//		System.out.println(user1);
		
		//second user
//		user.setName("Amit Rathore");
//		user.setCity("Indore");
//		user.setStatus("c Programmer");
//		
//		User user1 = userRepository.save(user);
//		System.out.println(user1);
		
		
		//third user
//		user.setName("vinod Rathore");
//		user.setCity("Indore");
//		user.setStatus("php Programmer");
//		
//		User user1 = userRepository.save(user);
//		System.out.println(user1);
		
		
		//////////////Or///////////////////
		
		//saving list of users
		
//		User user1 = new User();
//		user1.setName("Amit Rathore");
//		user1.setCity("Indore");
//		user1.setStatus("c Programmer");
//		
//		User user2 = new User();
//		user2.setName("vinod Rathore");
//		user2.setCity("Indore");
//		user2.setStatus("php Programmer");
//		
//		List<User> users = List.of(user1,user2);
//		
//		Iterable<User> result = userRepository.saveAll(users);
//		result.forEach(user->{
//			System.out.println(user);
//			});
//		
//		System.out.println("done");
		
		
		
		//update user
		
//		Optional<User> optional = userRepository.findById(5);
//		User user = optional.get();
//		System.out.println(user);
//		
//		user.setName("Abhay");
//		User result = userRepository.save(user);
//		System.out.println(result);

		
		//delele user
//		userRepository.deleteById(5);
//		System.out.println("success");
		
		
		//Get users
//		Optional<User> optional = userRepository.findById(6);
//		System.out.println(optional);
		
		//Get all Users
//		Iterable<User> result = userRepository.findAll();
//		for (User user : result) {
//			System.out.println(user);
//		}
		
		////////////////////or///////////////////
//		Iterable<User> result = userRepository.findAll();
//		result.forEach(user->System.out.println(user));
		
		
//		Iterable<User> result = userRepository.findAll();
//		Iterator<User> iterator = result.iterator();
//		while(iterator.hasNext()) {
//			User user = iterator.next();
//			System.out.println(user);
//		}
		
		
		//findByName method
//		List<User> name = userRepository.findByName("Neeraj Rathore");
//		name.forEach(e->System.out.println(e));
		
		//findByNameAndCity Method
		List<User> nameCity = userRepository.findByNameAndCity("Neeraj Rathore","Indore");
		nameCity.forEach(e->System.out.println(e));
		
	}

}
