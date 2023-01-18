package question18;

import java.util.Random;
import java.util.Scanner;

public class Guess_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random in = new Random();
		int r = in.nextInt(100);
		
		Scanner is = new Scanner(System.in);
		System.out.println("Guess a no.");
		int g = is.nextInt();
		if ( g == r ) {
			System.out.println("Correct ");
		}
		if ( g > r) {
			System.out.println("Too High, Try again");
		}
		if ( g < r) {
			System.out.println("Too less, Try again ");
		}
		System.out.println("Randam generated no. " +r);
		System.out.println("Guessed no. " +g);
	}

}
