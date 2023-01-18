package question2;

import java.util.Scanner;

public class positive_negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number to be checked ");
		float num = in.nextFloat();
		
		if (num == 0) {
			System.out.println(" The no. is zero,");
		}
		 if (num > 0) {
			System.out.println("The  no. " +num+ " is positive");
		 }
	     if (num >= 10000000) {
				System.out.println("The no. " +num+ " is positive and large");
			}
		if (num < 0) {
			System.out.println("The no." +num+ " is negatve and short ");
		}
		}
	}

