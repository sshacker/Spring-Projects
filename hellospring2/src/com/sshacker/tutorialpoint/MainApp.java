package com.sshacker.tutorialpoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        HelloWorld world = (HelloWorld) context.getBean("world");
        world.getMessage1();
        world.getMessage2();

        HelloIndia india = (HelloIndia) context.getBean("india");
        india.getMessage1();
        india.getMessage2();
        india.getMessage3();
    }
}
