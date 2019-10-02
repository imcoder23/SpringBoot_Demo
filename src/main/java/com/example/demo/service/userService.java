package com.example.demo.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.userRepository;

@Service
@Transactional
public class userService {
	private final userRepository userRepository;
	
	public userService(userRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public void saveMyUser(User user) {
		userRepository.save(user);
	}
	
}
