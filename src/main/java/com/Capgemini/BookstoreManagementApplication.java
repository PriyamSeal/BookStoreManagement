package com.bootcamp.bookstoremanagement;

import com.bootcamp.bookstoremanagement.Entity.User;
import com.bootcamp.bookstoremanagement.Repository.ILoginRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class BookstoreManagementApplication {
	
	
	@Autowired
	ILoginRepository loginRepository;
	@Autowired
	BCryptPasswordEncoder password;
	
	public static void main(String[] args) {
		SpringApplication.run(BookstoreManagementApplication.class, args);
	}
	

}
