package de.integrata.oop.sz.names;

public class Abbrev {

	public void doIt(int mxNoPts) {

		while (ptList.size() > mxNoPts) {
			Point rmvd = ptList.removeLast();
			sprList.add(rmvd);
		}
	}

}
