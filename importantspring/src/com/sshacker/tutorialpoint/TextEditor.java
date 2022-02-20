package com.sshacker.tutorialpoint;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {

	private SpellChecker spellChecker;

	@Autowired
	public TextEditor(SpellChecker spellChecker) {
		System.out.println("@Autowired constructor");
		this.spellChecker = spellChecker;
	}

	public void textEditorSpellingChecking() {
		spellChecker.checkingSpelling();
	}

}
