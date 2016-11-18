package de.integrata.oop.sz.methods;

import java.util.EnumSet;
import static de.integrata.oop.sz.methods.EnumDemo.Selection.*;


public class EnumDemo {
	
	public enum Selection { SELECTED, FOCUSED, DISABLED }
	
	public void draw(EnumSet<Selection> states) {
		if (states.contains(SELECTED)) {
			//
		}
		
		
	}

	
	
	public static void main(String[] args) {
		
		new EnumDemo().draw(EnumSet.of(SELECTED, DISABLED));
		
	}
	
	
	
}
