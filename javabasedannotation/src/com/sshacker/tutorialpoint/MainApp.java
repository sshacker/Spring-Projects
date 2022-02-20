package com.sshacker.tutorialpoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		Teacher obj1 = (Teacher) context.getBean(Teacher.class);
		Student obj2 = (Student) context.getBean(Student.class);
	}
}
