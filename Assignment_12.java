//Q. Find sub array with given sum.
//Given an array arr[] of non-negative integers and an integer sum, find a subarray that adds to a given sum.
//Note: There may be more than one subarray with sum as the given sum, print first such subarray. 

//Examples: 
//Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
//Output: Sum found between indexes 2 and 4
//Explanation: Sum of elements between indices 2 and 4 is 20 + 3 + 10 = 33

import java.util.*;

public class Assignment_12 {
    public void find_subarray_sum(int[] arr, int n, int sum) {
        int start = 0;
        boolean found = false;
        int current_sum = arr[0];
        int index;
        for (int i = 1; i <= n; i++) {
            while (current_sum > sum && start < i - 1) {
                current_sum = current_sum - arr[start];
                start++;
            }
            if (current_sum == sum) {
                index = i - 1;
                found = true;
                System.out.println("Sum found between indexes " + start + " and " + index);
                break;
            }
            if (i < n)
                current_sum = current_sum + arr[i];

        }
        if (found == false)
            System.out.println("The sum is not exist within the array!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = sc.nextInt();
        int sum;
        System.out.println("Enter the sum you want to search in array:");
        sum = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Assignment_12 obj = new Assignment_12();
        obj.find_subarray_sum(arr, n, sum);
        sc.close();
    }
}
