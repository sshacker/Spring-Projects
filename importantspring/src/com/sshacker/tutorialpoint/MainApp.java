package com.sshacker.tutorialpoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("AutowireByType.xml");
		TextEditor te = (TextEditor) context.getBean("texteditor");
		te.textEditorSpellingChecking();
	}
}
