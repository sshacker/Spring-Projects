package com.sshacker.tutorialpoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
// import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
    	// // using ClassPathXmlApplicationContext - providing file name at CLASSPATH
        // ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        // HelloWorld obj = (HelloWorld) context.getBean("helloworld");
    	
    	//using FileSystemXmlApplicationContext - providing full path
        ApplicationContext context = new FileSystemXmlApplicationContext(
                "C:/Users/shiva/OneDrive/Desktop/Spring-Projects/hellospring/src/Beans.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloworld");
        obj.getMessage();
        
    }
}
