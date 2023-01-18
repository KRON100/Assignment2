package question17;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no. to get fibonacci series");
		int n = in.nextInt();
		int n1 = 0, n2 = 1,i,  sum;
		System.out.print(n1 + " " + n2);
		for ( i = 2; i < n ; ++i ) {
			sum = n1 + n2;
			System.out.print(" " +sum );
			n1 = n2;
			n2 = sum;
		}
		

}
}
