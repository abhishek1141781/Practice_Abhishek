package com.cdac.geometry;

public class Point2D {
	// creating tight coupling via private keywords
	private int x;
	private int y;

//	1.1 Create a parameterized constructor to accept x & y co-ords.

//	public Point2D coordinates(int x, int yy) {
	public Point2D(int x, int yy) {
		this.x = x;
		this.y = yy;
	}

//	method for Point2D
//	public Point2D(int x, int yy) {
//
//		this.x = x;
//		this.y = yy;
//	}

//	1.2 Override toString --to return point's x & y co-ords
	@Override
	public String toString() {
		return this.x + " " + this.y;
	}

//	1.3 Add isEqual method to Point2D class : boolean returning method : must return true if both points are having same x,y co-ords or false otherwise.
//			eg : boolean status=p1.isEqual(p2);
//			Point2D 
//			public boolean isEqual(Point2d anotherPoint)//
//			{
//			  return this.x==anotherPoint.x && this.y==anotherPoint.y;
//			}
//			OR
//			override equals method inherited from Object class (IMPORTANT)
	public boolean isEqual(Point2D anotherPoint) {

//		this.x and x both are possible as even though x is private, we're accessing it from within the class scope
		return this.x == anotherPoint.x && y == anotherPoint.y;
	}

//	1.4 Add a method , calculateDistance , to calc distance between 2 points
//	Hint : use distance formula.

//	public double calculateDistance(Point2D a, Point2D b) {		
	public static double calculateDistance(Point2D a, Point2D b) {
		return Math.sqrt(Math.pow((a.x - b.x),2) + Math.pow((a.y - b.y),2));		
//		return Math.sqrt((a.x - b.x) ^ 2 + (a.y - b.y) ^ 2);
	}


//	Distance using a single point
	public double calculateDistanceUsingThis(Point2D a) {
//	public static double calculateDistanceUsingThis(Point2D a) { // making this method static as using a non static
																// method is a pain in the ass
//		return Math.sqrt((x - a.x) ^ 2 + (y - a.y) ^ 2);		// don't use ^ it's not power it's xor
		return Math.sqrt(Math.pow((x - a.x),2) + Math.pow((y - a.y),2));		
//		Cannot use `this` keyword in a static context

	
//	public static void calculateDistanceUsi(Point2D point2d, Point2D point2d2) {
//		// TODO Auto-generated method stub
//		
//	}
	}
}


