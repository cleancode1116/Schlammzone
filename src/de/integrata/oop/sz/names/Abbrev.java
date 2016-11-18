package de.integrata.oop.sz.names;

public class Abbrev {

	public void doIt(int maxNumberOfPoints) {

		while (pointList.size() > maxNumberOfPoints) {
			Point removed = pointList.removeLast();
			spareList.add(removed);
		}
	}

}
