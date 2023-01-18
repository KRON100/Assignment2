package question14;

import java.util.Scanner;

public class Count_positive_negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("How many no. to be entered");
		int n = in.nextInt();
		int count = 0;
		int count1 = 0;
		int count2 = 0;
		System.out.println("Enter numbers ");
		int [] array = new int [100];
		for (int i = 0; i<n ;i++) {
			array[i] = in.nextInt();
		}
		
		for (int i =0; i<n ; i++) {
			if (array[i] % 2 == 0) {
				int positive = array[i];
				++count;
			}
			else if (array[i] == 0) {
				int zero = array[i];
				++count1;
			}
			else {
				int negative = array[i];
			++count2;
		}

	}
		System.out.println("Negative: " +count2+ " Positive: " +count+ " Zero: " +count1);

}
}