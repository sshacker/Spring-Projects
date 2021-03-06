package com.sshacker.tutorialpoint.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbc.xml");
		StudentJDBCTemplete studentJDBCTemplete = (StudentJDBCTemplete) context.getBean("studentJDBCTemplete");

		System.out.println("--------- Record Insertion -------------");
		studentJDBCTemplete.insert("Rohan", 23);
		studentJDBCTemplete.insert("Sohan", 20);
		studentJDBCTemplete.insert("Mohan", 15);
		studentJDBCTemplete.insert("Saran", 21);
		studentJDBCTemplete.insert("Tommay", 30);

		System.out.println("---------- List All Student ----------------");
		List<Student> students = studentJDBCTemplete.listStudent();
		for (Student record : students) {
			System.out.println(record.getId() + " " + record.getName() + " " + record.getAge());
		}

		System.out.println("------------ Get Student ---------------");
		Student student = studentJDBCTemplete.getStudent(2);
		System.out.println(student.getId() + " " + student.getName() + " " + student.getAge());

	}
}
