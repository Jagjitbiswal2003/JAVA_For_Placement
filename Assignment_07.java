//Check whether the digit is palindrome  or not using loop and function

import java.util.*;
public class Assignment_07 {
    public void is_palindrome(int number) {
        int remainder;
        int reverse = 0;
        int temp;
        temp = number;
        if (number <= 0) {
            System.out.println("The given number " + number + " is not valid");
            System.exit(0);
        }

        while (number != 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        if (temp == reverse)
            System.out.println("The number " + temp + " is a palindrome number");
        else
            System.out.println("The number " + temp + " is not a palindrome number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a two or more digit number to check whether it is palindrome or not");
        int number = sc.nextInt();
        Assignment_07 obj = new Assignment_07();
        obj.is_palindrome(number);
        sc.close();
    }
}
