package com.sshacker.springannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
	
	@Autowired
	@Qualifier("snapdragon")
	MobileProcessor cpu;
	
	public void config() {
		System.out.println("Octa core, Ram 4GB, Camera 48MP");
		cpu.brand();
	}
}
