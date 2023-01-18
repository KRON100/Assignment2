package question21;

import java.util.Scanner;

public class Sum_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			/* Function to get sum of digits */
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no to get sum of its digits: ");
		int sum = 0;
		int c = 0 ;
		int n = in.nextInt();
			{
				
				while (n != 0)
				{
					sum = sum + n % 10;
					n = n/10;
				}
			
			}
			System.out.println("Sum of Digits " +sum);

	}
}