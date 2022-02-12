package com.sshacker.springannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        // Samsung s7 = new Samsung();
        // s7.config();
    	
    	ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
    	Samsung obj = factory.getBean(Samsung.class);
    	obj.config();
    }
}
