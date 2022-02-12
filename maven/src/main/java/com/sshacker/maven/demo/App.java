package com.sshacker.maven.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        Tyre obj = (Tyre)context.getBean("tyre");
        System.out.println(obj);
    }
}
