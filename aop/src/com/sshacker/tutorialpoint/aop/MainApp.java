package com.sshacker.tutorialpoint.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Aop.xml");
		Student s = (Student) context.getBean("student");
		System.out.println(s.getName());
		System.out.println(s.getAge());
		s.printThrowException();
	}

}
