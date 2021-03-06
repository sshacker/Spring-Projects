package com.sshacker.tutorialpoint.transaction;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("tansactionBeans.xml");

      StudentDAO studentJDBCTemplate = (StudentDAO) context.getBean("studentJDBCTemplate");

      System.out.println("------Records creation--------");
      studentJDBCTemplate.insert("Zara", 11, 99, 2010);
      studentJDBCTemplate.insert("Nuha", 20, 97, 2010);
      studentJDBCTemplate.insert("Ayan", 25, 100, 2011);

      System.out.println("------Listing all the records--------");
      List<StudentMarks> studentMarks = studentJDBCTemplate.listStudentMarks();

      for (StudentMarks record : studentMarks) {
         System.out.print("ID : " + record.getId());
         System.out.print(", Name : " + record.getName());
         System.out.print(", Marks : " + record.getMarks());
         System.out.print(", Year : " + record.getYear());
         System.out.println(", Age : " + record.getAge());
      }

      System.out.println("------to simulate the rollback by exception--------");
      studentJDBCTemplate.insert("Arjun", 25, 94, 2011);
      studentJDBCTemplate.insert("Raju", 20, 101, 2022);
      studentJDBCTemplate.insert("karan", 25, 91, 2011);
   }
}