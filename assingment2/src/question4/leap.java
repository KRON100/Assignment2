package question4;

import java.util.Scanner;

public class leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//Program to find a leap year
		System.out.println("Enter a year");
		int year = in.nextInt();
		if (year % 400 == 0 ) {
			System.out.println("this is a leap year");
		}
	    if (year % 100 == 0 ) {
	    	System.out.println("this is not a leap year");
	    }
		if ( year % 4 == 0) {
					System.out.println("this is a leap year");
				}
		else System.out.println("this is not a leap year");
		}
}
