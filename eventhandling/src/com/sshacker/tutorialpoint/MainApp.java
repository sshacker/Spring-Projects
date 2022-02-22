package com.sshacker.tutorialpoint;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("EventHandler.xml");
		context.start();

		HelloWorld obj = (HelloWorld) context.getBean("helloworld");
		obj.getMessage();

		context.stop();
	}
}
