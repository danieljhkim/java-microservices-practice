package com.practice.rest.webservices.restwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	// JPA/Hibernate -> database
	// UserDaoService -> static list
	
	private static List<User> users = new ArrayList<>();
	private static Integer userCount = 0;
	
	static {
		users.add(new User(++userCount, "Adam", LocalDate.now().minusYears(20)));
		users.add(new User(++userCount, "dan", LocalDate.now().minusYears(30)));
		users.add(new User(++userCount, "adriana", LocalDate.now().minusYears(40)));
		users.add(new User(++userCount, "tony", LocalDate.now().minusYears(60)));
	}
	
	public List<User> findAll() {
		return users;
	}
	
	public User save(User user) {
		user.setId(++userCount);
		users.add(user);
		return user;
	}
	
	public User findOne(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().orElse(null);
	}
}










