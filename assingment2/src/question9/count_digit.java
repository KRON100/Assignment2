package question9;

import java.util.Scanner;

public class count_digit {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.println("Enter the no. to find its digit:");
    int count = 0;
    int num = in.nextInt();

    while (num != 0) {
      // num = num/10
      num = num / 10;
      ++count;
    }

    System.out.println("Number of digits: " + count);
  }
}