package com.cdac.tester;

import java.util.Scanner;

import com.cdac.geometry.Point2D;

public class Driver {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("So tell me how many points do you want to plot: ");
//			int[] points = new int[sc.nextInt()];	//use Point2D[] instead of int[] in both places
			Point2D[] points = new Point2D[sc.nextInt()];

//			Array Definition and accepting points
			for (int i = 0; i < points.length;) {
				System.out.println("Enter point " + (i+1) + " : ");
				points[i++] = new Point2D(sc.nextInt(), sc.nextInt()); // The method Point2D(int, int) is undefined for
																		// the
																		// type Driver

//				new is to be added to below line to create a new object
//				Point2D(sc.nextInt(), sc.nextInt()); // The method Point2D(int, int) is undefined for the
			}

//			printing using for each loop
			System.out.println("Printing using FOR EACH loop: ");
			for (Point2D j : points) {
				System.out.println(j);
			}

//			using for loop for printing
			System.out.println("Printing Points using for Loop: ");
			for (int i = 0; i < points.length; i++) {
				System.out.println(i + ": " + points[i]);
			}

//			check if input indices are same or different 
			System.out.println("Input two indices to check if points at each index is same: start with `0` ");

			{
				System.out.println("Enter 1st index: ");
				int i = sc.nextInt();
				System.out.println("Enter 2nd index: ");
				int j = sc.nextInt();

				do {
					i = sc.nextInt();
					j = sc.nextInt();
				// if (i>=0 && i<points.length)
	//			while(i<0 || i>points.length || j<0 || j>points.length) {			
				}
//					while (i >= 0 && i < points.length && j >= 0 && j < points.length);
					while (i<=0 || i>points.length || j<=0 || j>points.length);
	
	//			comparing points2D using == 
				boolean check = (points[i] == points[j]);
				if (check)
					System.out.println("comparing points2D using == : TRUE");
	
	//			COMPARING USING isEqual
				boolean checks = points[i].isEqual(points[j]);
				if (checks)
					System.out.println("comparing using isEqual: if " + points[i] + " vs " + points[j] + " : " + checks);
				else
					System.out.print(
							"Calculate Distance using static fn calculateDistance(points[i], points[j] called using ClassName.methodName: ");
				System.out.println(Point2D.calculateDistance(points[i], points[j]));
	//				System.out.println();


				System.out.println("");
			
//			Distance using a single point

			boolean checksing = points[i].isEqual(points[j]);
			if (checksing)
				System.out.println("comparing using isEqual: if " + points[i] + " vs " + points[j] + " : " + checksing);
			else
				System.out.print(
						"Calculate Distance using non-static fn calculateDistance(points[i], points[j] called using ClassName.methodName: ");
//			Point2D cdut = new Point2D(points[i], j);	// can we call this method as a non static method
			System.out.println(points[i].calculateDistanceUsingThis(points[j]));
			
			
			System.out.println("");
			System.out.println("Code Termiated.....");

			}
		}
	}
}
