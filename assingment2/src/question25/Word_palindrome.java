package question25;

import java.util.Scanner;

public class Word_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a word to be checked");
		String a = in.next();
		String rev = "";
		for (int i = a.length()-1; i >= 0;--i) {
			rev = rev  + a.charAt(i);
			
		}
		if (a.toLowerCase().equals(rev.toLowerCase())) {
			System.out.println(a +" Palindrome");
		}
		else 
			System.out.println("Not");

	}

}
