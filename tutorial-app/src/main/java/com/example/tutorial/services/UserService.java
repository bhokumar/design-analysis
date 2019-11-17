package com.example.tutorial.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.example.tutorial.model.User;

@Service
public class UserService {
	@Autowired
	MongoTemplate mongoTemplate;
	
	public User insertUser(User user) {
		return mongoTemplate.save(user, "users");
	}
}
