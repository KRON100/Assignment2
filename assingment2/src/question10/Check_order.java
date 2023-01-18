package question10;

import java.util.Scanner;

public class Check_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner (System.in);
		System.out.println("Enter any three no. to check its order");
		int num = in.nextInt();
		int num1 = in.nextInt();
		int num2 = in.nextInt();
			if ( num < num1 && num < num2 && num1 < num2) {
				System.out.println("Increasing Order");
        	}
			else {
        		System.out.println("Not in any order");
        		}
			if ( num > num1 && num > num2 && num1 > num2)  {
				System.out.println("Decreasing Order");
			}
	}

}