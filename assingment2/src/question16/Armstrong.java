package question16;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no. to check armstrong (no. < 500): ");
		int n = in.nextInt();
		int temp, r, sum = 0;
		temp = n;
		while (n > 0) {
			r = n % 10 ;
			sum = sum + (r * r * r);
			n = n / 10 ;
		}
		if ( sum == temp) {
		System.out.println("Given " + temp + " is Armstrong no.");
		}
		else
			System.out.println("Given " + temp + " is  not an Armstrong no.");

	}

}
