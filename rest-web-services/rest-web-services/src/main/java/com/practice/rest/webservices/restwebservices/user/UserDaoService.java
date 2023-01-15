package com.practice.rest.webservices.restwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	// JPA/Hibernate -> database
	// UserDaoService -> static list
	
	private static List<User> users = new ArrayList<>();
	
	static {
		users.add(new User(1, "Adam", LocalDate.now().minusYears(20)));
		users.add(new User(2, "dan", LocalDate.now().minusYears(30)));
		users.add(new User(3, "adriana", LocalDate.now().minusYears(40)));
		users.add(new User(4, "tony", LocalDate.now().minusYears(60)));
	}
	
	public List<User> findAll() {
		return users;
	}
	
	public User save(User user) {
		return "";
	}
	
	public User findOne(int id) {
		return ;
	}
}
