package question23;

import java.util.Scanner;
public class Decimal_to_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter decimal  no. ");
        Integer n = in.nextInt();
		System.out.println(n.toBinaryString(n));
			
		}
	}

