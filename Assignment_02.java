//this program is used to check whether the value is positive or negative or zero.
package Practice_01;

import java.util.*;

public class Assignment_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value to check whether it is zero,positive or negative:");
        int value = sc.nextInt();
        if (value == 0)
            System.out.println("The value" + value + "is Zero and Positive");
        else if (value > 0)
            System.out.println("The value " + value + " is positive ");
        else
            System.out.println("The value " + value + " is negative");
        sc.close();
    }
}
