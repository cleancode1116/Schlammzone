package de.integrata.oop.sz.methods;

import java.io.Writer;

public class LetterPrinter {

	private Letter letter;

	public void printLetter(Letter letter, Writer writer) {
		this.letter = letter;
				
		printHeader(writer);
		
		printAddress(writer);
		
		printText(writer);
		
		
	}
	
	
	
}
