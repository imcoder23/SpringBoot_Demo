package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.User;

public interface userRepository extends CrudRepository<User, Integer> {
	
}
