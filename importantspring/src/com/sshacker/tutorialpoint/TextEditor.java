package com.sshacker.tutorialpoint;

public class TextEditor {
	private SpellChecker spellChecker;

	public TextEditor(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public void textEditorSpellingChecking() {
		spellChecker.checkingSpelling();
	}
}
