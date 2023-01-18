package question20;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter no to check prime or not");
			    int num = in.nextInt();
			    int flag = 0;
			    for (int i = 2; i <= num / 2; ++i) {
			      // condition for nonprime number
			      if (num % i == 0) {
			        flag = 1;
			        break;
			      }
			    }

			    if (flag == 0)
			      System.out.println(num + " is a prime number.");
			    else
			      System.out.println(num + " is not a prime number.");
			  
			

	}

}
