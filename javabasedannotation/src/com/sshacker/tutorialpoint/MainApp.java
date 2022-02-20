package com.sshacker.tutorialpoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfigFile.class);
		HelloWorld obj = (HelloWorld) context.getBean(HelloWorld.class);
		obj.setMessage("Hello World !!!");
		obj.getMessage();
	}
}
