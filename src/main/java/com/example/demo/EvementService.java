package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.EvenementRepository;

@SpringBootApplication
public class EvementService implements CommandLineRunner {

	@Autowired
	EvenementRepository evenementRepository;

	public static void main(String[] args) {
		SpringApplication.run(EvementService.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
	

}
