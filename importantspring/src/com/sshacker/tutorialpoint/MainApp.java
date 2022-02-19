package com.sshacker.tutorialpoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("CollectionBeans.xml");
		JavaCollection jc = (JavaCollection) context.getBean("javacollection");
		System.out.println(jc.getAddressList());
		System.out.println(jc.getAddressSet());
		System.out.println(jc.getAddressMap());
		System.out.println(jc.getAddressProperties());
	}
}
