package com.sshacker.tutorialpoint;

public class TextEditor {
	private SpellChecker spellChecker;
	private String name;

	TextEditor(SpellChecker spellChecker, String name) {
		this.spellChecker = spellChecker;
		this.name = name;
	}

	public void textEditorSpellingChecking() {
		System.out.println(name);
		spellChecker.checkingSpelling();
	}

}
