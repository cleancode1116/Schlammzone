package de.integrata.oop.sz.names;

import java.util.List;

public class TextRauschen {

	public void addEvenValues(List<Integer> source, List<Integer> target) {
		for (Integer next : source) {
			if (next % 2 == 0) {
				target.add(next);
			}
		}
	}
	
	public boolean isEqual(Object anObject, Object anotherObject) {
		return false;
	}
}
