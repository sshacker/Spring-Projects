package com.sshacker.tutorialpoint;

public class John {
	private String name;
	private Jane jane;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Jane getJane() {
		return jane;
	}

	public void setJane(Jane jane) {
		this.jane = jane;
	}

	public void johnDetails() {
		System.out.println(name + " " + jane.name2 + " " + jane.hubby);
	}
}
