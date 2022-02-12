package com.sshacker.springannotation;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements MobileProcessor {

	public void brand() {
		System.out.println("Snapdragon wolrd's best cpu");
	}
}
