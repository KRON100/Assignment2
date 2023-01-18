package question11;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter to get reversed");

			    int num = in.nextInt(),
			    		reversed = 0;
			    
			    System.out.println("Original Number: " + num);

			    // run loop until num becomes 0
			    while(num != 0) {
			    
			      // get last digit from num
			      int digit = num % 10;
			      reversed = reversed * 10 + digit;

			      // remove the last digit from num
			      num /= 10;
			    }

			    System.out.println("Reversed Number: " + reversed);
			  }
}
