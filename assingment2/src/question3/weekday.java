package question3;

import java.util.Scanner;

public class weekday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		// Program to find weekday
		
		System.out.println("Enter a no from 1 to 7 ");
		int num = in.nextInt();
		if (num == 1) {
			System.out.println("Monday");
		}
		if (num == 2) {
			System.out.println("Tuesday");
		}
		if (num == 3) {
			System.out.println("Wednesday");
		}
		if (num == 4) {
			System.out.println("Thursday");
		}
		if (num == 5) {
			System.out.println("Friday");
		}
		if (num == 6) {
			System.out.println("Saturday");
		}
		if (num == 7) {
			System.out.println("Sunday");
		}
	}
}