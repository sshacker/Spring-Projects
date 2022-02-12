package com.sshacker.maven.demo;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	public void drive() {
		System.out.println("Chal raha hai...");
	}
}
