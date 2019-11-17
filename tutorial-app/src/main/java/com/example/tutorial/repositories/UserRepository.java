package com.example.tutorial.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.tutorial.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
}
