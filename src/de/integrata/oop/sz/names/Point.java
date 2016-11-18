package de.integrata.oop.sz.names;

public class Point {

	public static class Builder {
		private double angle;
		private double distance;
		public Builder angle(double d) {
			angle = d;
			return this;
		}
		public Builder distance(double d) {
			distance = d;
			return this;
		}
		public Point andBuild() {
			return new Point(angle, distance);
		}
		

	}

	private int x;
	private int y;
	
	public static Point createFromXY(int x, int y) {
		return new Point(x, y);
	}
	
	public static Point createFromAngleAndDistance(double angle, double distance) {
		return new Point(angle, distance);
	}

	
	private Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	private Point(double angle, double distance) {
		// ...
	}
	
	
	public static void main(String[] args) {
		Point p = Point.createFromXY(10, 20);
		Point p2 = Point.createFromAngleAndDistance(10.0, 10.0);
		
		Point p3 = Point.createWith().angle(10d).distance(10d).andBuild();
		
	}

	public static Builder createWith() {
		return new Builder();
	}


	
	
	
	
}
