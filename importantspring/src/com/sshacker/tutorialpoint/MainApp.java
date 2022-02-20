package com.sshacker.tutorialpoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationBase.xml");
		Student s = (Student) context.getBean("student");
		System.out.println(s.getsName());
		System.out.println(s.getsAge());
	}
}
