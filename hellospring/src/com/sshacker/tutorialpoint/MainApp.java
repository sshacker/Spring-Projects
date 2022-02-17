package com.sshacker.tutorialpoint;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        // example of init-method and destroy-method
        // using AbstractApplicationContext and registerShutdownHook for destroy-method
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        HelloWorld obj1 = (HelloWorld) context.getBean("helloworld");
        obj1.getMessage();

        context.registerShutdownHook();
    }
}
