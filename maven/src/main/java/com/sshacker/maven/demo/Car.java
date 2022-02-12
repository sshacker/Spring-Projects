package com.sshacker.maven.demo;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	Tyre tyre;
	
	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	public void drive() {
		System.out.println("Chal raha hai...");
	}
}
