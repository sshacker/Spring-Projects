package com.sshacker.maven.demo;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
	public void drive() {
		System.out.println("Bhaag raha hai...");
	}
}
