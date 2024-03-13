//wite a program to calculate the sum of the numbers occuring in the multiplication table.
//user give which multiplication table they want to find the sum of that table.

import java.util.*;
public class Assignment_10 {
    public int Multiply_Table_Sum(int table) {
        int sum = 0;
        int multiply;
        for (int i = 1; i <= 10; i++) {
            multiply = table * i;
            sum = sum + multiply;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the table:");
        int table = sc.nextInt();
        Assignment_10 obj = new Assignment_10();
        System.out.println("The sum of the " + table + " table is:" + obj.Multiply_Table_Sum(table));
        sc.close();
    }
}
