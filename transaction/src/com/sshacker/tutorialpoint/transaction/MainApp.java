package com.sshacker.tutorialpoint.transaction;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("tansactionBeans.xml");
      StudentJDBCTemplete studentJDBCTemplete = (StudentJDBCTemplete) context
            .getBean("studentJDBCTemplete");

      System.out.println("------Records creation--------");
      studentJDBCTemplete.insert("Zara", 11, 99, 2010);
      studentJDBCTemplete.insert("Nuha", 20, 97, 2010);
      studentJDBCTemplete.insert("Ayan", 25, 100, 2011);

      System.out.println("------Listing all the records--------");
      List<StudentMarks> studentMarks = studentJDBCTemplete.listStudentMarks();

      for (StudentMarks record : studentMarks) {
         System.out.print("ID : " + record.getId());
         System.out.print(", Name : " + record.getName());
         System.out.print(", Marks : " + record.getMarks());
         System.out.print(", Year : " + record.getYear());
         System.out.println(", Age : " + record.getAge());
      }
   }
}