package com.sshacker.tutorialpoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationBase.xml");
		Profile p = (Profile) context.getBean("profile");
		p.printName();
		p.printAge();
	}
}
