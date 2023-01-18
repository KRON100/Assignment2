package question1;

import java.util.Scanner;

public class Find_greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		// Program to find greatest
		System.out.println("Enter three no to find the greatest ");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		if (num1 > num2 && num1 > num3) {
			System.out.println("the greatest no. is " +num1);
		}
		else if (num2 > num1 && num2 > num3) {
			System.out.println("the greatest no. is " +num2);
		}
		else System.out.println("the greatest no. is " +num3);
	}

}
