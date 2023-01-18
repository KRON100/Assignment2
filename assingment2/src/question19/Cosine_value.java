package question19;

import java.lang.Math;
import java.util.Scanner;

public class Cosine_value {
  public static void main(String[] args) {
	  
	  Scanner in = new Scanner(System.in);
	  System.out.println("Enter no. to get its cosine");
	  double a = in.nextDouble();

    a = Math.toRadians(a);

    // print the cosine value
    System.out.println(Math.cos(a));  // 0.8660254037844387
  }
}