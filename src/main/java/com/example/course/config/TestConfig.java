package com.example.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.course.entities.User;
import com.example.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Jao", "jao@gmail.com" , "44556677", "123");
		User u2= new User(null, "Jose" ,"jose@gmail.com" , "33556677", "1234");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		
	}
	
	
	
}
