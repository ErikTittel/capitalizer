package de.ham.se.capitalizer;

public class Capitalizer {

	private String text;
	
	public Capitalizer(String initialText) {
		this.text = initialText;
	}

	public String getCapitalizedText() {
		return text.toUpperCase();
	}
	
}
