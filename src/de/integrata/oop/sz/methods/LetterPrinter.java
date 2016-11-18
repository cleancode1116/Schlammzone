package de.integrata.oop.sz.methods;

import java.io.Writer;

public class LetterPrinter {

	private Letter letter;
	private Writer writer;

	public LetterPrinter(Letter letter, Writer writer) {
		this.letter = letter;
		this.writer = writer;
	}
	
	public void printLetter() {
		
		printHeader();
		
		printAddress();
		
		printText();
		
		
	}
	
	
	
}
