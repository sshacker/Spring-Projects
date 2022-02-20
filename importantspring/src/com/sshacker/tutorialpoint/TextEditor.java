package com.sshacker.tutorialpoint;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {

	@Autowired
	private SpellChecker spellChecker;

	public void textEditorSpellingChecking() {
		spellChecker.checkingSpelling();
	}

}
