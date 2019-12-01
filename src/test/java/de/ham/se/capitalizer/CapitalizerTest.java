package de.ham.se.capitalizer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CapitalizerTest {

	@Test
	public void testGetCapitalizedText() {
		//Build
		Capitalizer cap = new Capitalizer("abc");
		
		//Operate
		String textToCheck = cap.getCapitalizedText();
		
		//Check
		assertEquals("ABC", textToCheck);
	}
}
