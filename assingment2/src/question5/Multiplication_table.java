package question5;

import java.util.Scanner;

public class Multiplication_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//Program to create multiplication table
		System.out.println("Enter no.");
		int num = in.nextInt();
		for (int i=1; i <= 10; i++) {
			System.out.println(num + "*" + i + "=" + num*i);
		}

	}

}
