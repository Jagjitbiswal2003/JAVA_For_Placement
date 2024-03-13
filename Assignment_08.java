//Check whether the  number is Amstrong or not using loop and function.
//n-is the no of digits in a number    ex- 1234  n=4 no of digits
import java.util.*;
public class Assignment_08 {
    public void is_amstrong(int number,int n) {
        int remainder;
        int sum = 0;
        int temp;
        temp = number;
        if (number <= 0 || n==0) {
            System.out.println("The given number " + number + " is not valid");
            System.exit(0);
        }
        while (number != 0) {
            remainder = number % 10;
            sum = (int) (sum + Math.pow(remainder, n));
            number = number / 10;
        }
        if (temp == sum)
            System.out.println("The number " + temp + " is a amstrong number");
        else
            System.out.println("The number " + temp + " is not a amstrong number");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of digits present in a number:");
        int n=sc.nextInt();
        System.out.println("Enter a number to check whether it is amstrong or not:");
        int number = sc.nextInt();
        Assignment_08 obj = new Assignment_08();
        obj.is_amstrong(number,n);
        sc.close();
    }
}
