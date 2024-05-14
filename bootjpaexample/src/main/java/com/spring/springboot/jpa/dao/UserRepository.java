package com.spring.springboot.jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.spring.springboot.jpa.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
//	@Query("select u from User u")
//	public List<User> findByName(String name);	
	
	//Using Query----parameterized
//	@Query("select u from User u where name =:n")
//	public List<User> findByName(@Param("n")String name);
	
	//Using native sql Query
//	@Query(value="select * from User  where name =:n",nativeQuery = true)
//	public List<User> findByName(@Param("n")String name);
	

	
	
	public List<User> findByName(String name);
	
	
	@Query("select u from User u where name=:n and city=:c")
	public List<User> findByNameAndCity(@Param("n")String name,@Param("c") String city);
}
