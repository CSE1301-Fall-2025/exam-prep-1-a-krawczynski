package pastexam.codewriting;

import java.util.Scanner;

public class Q02 {

	/*
	 * Finish the following program such that it 
	 * will get user input for width and height and
	 * compute the area of rectangles until the user 
	 * enters values that result in an area of 0. For 
	 * example, if the height was 10.5 and the width 
	 * was 2, it should print out a message indicating 
	 * an area of 21.0 and continue to prompt for another 
	 * rectangle.
	 */
	
	public static void main(String[] args) {
		double area = 1;
		while (area != 0) {
			Scanner width = new Scanner(System.in);
			System.out.println("What should the width be?");
			double w = width.nextDouble();
			Scanner height = new Scanner(System.in);
			System.out.println("What should the height be?");
			double h = height.nextDouble();
			area = w*h;
			System.out.println("Area is " + area + ".");
		}
		
		System.out.println("Program terminated.");
	}
}
