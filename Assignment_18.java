//WAP to find the minimum element whose product is the target, that target provides by the user.
//The array is in random order and the array don't contain any duplicate elment.
//EX- arry elements are - 554 778 655 908. the target is 100.
// Output is 554.
//EX- arry elements are - 199,222,343,554. the target is 100.
// Output- There is no such minimum element whose product is same as target!.

import java.util.*;

public class Assignment_18 {
    public static void find_minimum(int[] arr, int target) {
        int min = arr[0];
        int product = 1;
        boolean flag = false;
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                while (min > 0) {
                    int rem = min % 10;
                    product = product * rem;
                    min = min / 10;
                }

            }
            if (product == target) {
                flag = true;
                System.out.println("we found the minimum element whose product is same as target!: " + min);
            }
        }
        if (flag == false)
            System.out.println("There is no such minimum element whose product is same as target!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = sc.nextInt();
        System.out.println("Enter the target product:");
        int target = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        find_minimum(arr, target);
        sc.close();
    }
}
