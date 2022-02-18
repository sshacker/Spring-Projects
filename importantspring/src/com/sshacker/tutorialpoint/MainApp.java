package com.sshacker.tutorialpoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("DependencyInjectionBeans.xml");
		Foo obj = (Foo) context.getBean("foo");
	}
}