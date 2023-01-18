package question13;

import java.util.Scanner;

public class Hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two no. to get HCF");
		int a =in.nextInt(), b =in.nextInt(), i;
		int hcf = 0;
		for(i = 1; i <=a || i <=b; i++) {
			if ( a%i ==0 &&  b%i ==0) {
				hcf = i;
				
			}
			
		}
		System.out.println("HCF is " +hcf);
		

	}

}
