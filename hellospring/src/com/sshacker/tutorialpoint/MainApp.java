package com.sshacker.tutorialpoint;

// import org.springframework.context.ApplicationContext;
// import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.beans.factory.BeanFactory;

public class MainApp {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        // ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        // HelloWorld obj = (HelloWorld) context.getBean("helloworld");

        // using XmlBeanfactory - deprecated
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
        HelloWorld obj = (HelloWorld) factory.getBean("helloworld");
        obj.getMessage();
    }
}
