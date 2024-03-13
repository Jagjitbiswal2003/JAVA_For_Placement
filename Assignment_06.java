//WAP to check whether a number is prime or not using loop.

import java.util.*;
public class Assignment_06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to check whether it is prime or not");
    int number = sc.nextInt();
    boolean flag = false;

    if (number < 0) {
      System.out.println("The number " + number + " is not valid to check");
      System.exit(0);
    }
    if (number == 0 && number == 1)
      System.out.println("The number " + number + " is prime");

    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        flag = false;
        break;
      } else
        flag = true;
    }

    if (flag == true)
      System.out.println("The number " + number + " is prime");
    else
      System.out.println("The number" + number + " is not prime");
    sc.close();
  }
}
