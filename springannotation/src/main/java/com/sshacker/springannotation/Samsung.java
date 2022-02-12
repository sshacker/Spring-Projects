package com.sshacker.springannotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung {
	@Autowired
	MobileProcessor cpu;
	
	public void config() {
		System.out.println("Octa core, Ram 4GB, Camera 48MP");
		cpu.brand();
	}
}
