package de.integrata.oop.sz.names;

import java.util.List;

public class TextRauschen {

	public void addEvenValues(List<Integer> list1, List<Integer> list2) {
		for (Integer next : list1) {
			if (next % 2 == 0) {
				list2.add(next);
			}
		}
	}
}
