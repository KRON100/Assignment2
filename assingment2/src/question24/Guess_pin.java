package question24;

import java.util.Scanner;

public class Guess_pin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		final int pin = 123456;
		System.out.println("Enter the pin");
		int temp = in.nextInt();
		
            for (int i = 1; i <= 2 && temp != pin ; i++) {
				System.out.println("Incorrect, Try again");
			System.out.println("Re-enter the pin");
			temp = in.nextInt();
		
			System.out.println("Sorry but you have been locked out");

		}
		
			if ( temp == pin) {
			System.out.println("Correct, Welcome back");
		}
		
	}

}

