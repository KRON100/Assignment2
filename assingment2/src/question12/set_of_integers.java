package question12;

import java.util.Scanner;

public class set_of_integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int odd = 0;
		int even = 0;
		 
		int[] array = new int[100];
		System.out.println("Enter set of integers "); 
		int a = in.nextInt();
		for (int i = 0; i<a; i++) {
			array[i] = in.nextInt();

	}
		 /* for (int i = 0; i<a; i++) {
			System.out.println("Your array elements are: "+array[i]);
		} */
		
		for (int i = 0; i<a; i++) {
			if ( array[i] % 2 == 0 ) {
				even += array[i];
				
				
			}
			else {
				odd += array[i];
			
		}
			
}
		System.out.println("Sum of even no. " +even);
		System.out.println("Sum of odd no. " +odd);
}
}