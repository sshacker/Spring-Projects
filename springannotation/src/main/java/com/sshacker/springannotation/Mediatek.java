package com.sshacker.springannotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mediatek implements MobileProcessor {

	public void brand() {
		System.out.println("Mediatek 2nd best processor");
	}
}
