package com.EduBridge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import myPack.Player;

@SpringBootApplication
public class Welcome7963Application implements CommandLineRunner {
	@Autowired
	@Qualifier("First")
	Cutter c;
	@Autowired
	Joiner j;
	@Autowired
	Area a;
	@Autowired
	Player p;

	public static void main(String[] args) {
		SpringApplication.run(Welcome7963Application.class, args);
		System.out.println("Welcome to Spring Boot! using STS");
	}

	@Override
	public void run(String... args) throws Exception {
		this.c.cutting();
		j.join();
		a.setRadius(5);
		a.area();
		p.plays();
	}

}
