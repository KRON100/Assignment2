package question15;

import java.util.Scanner;

public class Largest_smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int i;
		int k;
		int temp;
		System.out.println("How many no. to be entered");
		int n = in.nextInt();
		System.out.println("Enter numbers ");
		int [] array = new int [100];
		for ( i = 0; i<n ;i++) {
			array[i] = in.nextInt();
		}
		int smallest= array[0];
		int largest = array[0];
		/*for ( i=0 ; i<n ;i++) {
			System.out.println(array[i]);
		}
		*/
		for (i = 0; i<n ; i++) {
				if ( array[i] < smallest) {
					smallest = array[i];
				}
				if ( array[i] > largest) {
					largest = array[i];
			}
			}
		System.out.println("Largest no. is " +largest);
		System.out.println("Smallest no. is " +smallest);
}
}