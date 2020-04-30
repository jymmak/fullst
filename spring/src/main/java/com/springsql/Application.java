package com.springsql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springsql.repo.CustomerRepository;



@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	CustomerRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Override
	public void run(String... arg0) throws Exception{
		repository.deleteAll();
		
	}


}
