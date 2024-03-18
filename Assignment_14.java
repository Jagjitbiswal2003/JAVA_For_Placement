//Given an array arr[] of size N. The task is to find the sum of the contiguous subarray-
// within a arr[] with the largest sum. 
//This is a problem of kadane's algo. **most important.
//if you use static keyword in function then don't create object for the function.

import java.util.*;

public class Assignment_14 {
    static int maxSubArraySum(int a[]) {
        int size = a.length;
        int max_sum = Integer.MIN_VALUE;
        int current_sum = 0;
        if (size == 0)
            System.exit(0);

        for (int i = 0; i < size; i++) {
            current_sum = current_sum + a[i];
            if (max_sum < current_sum)
                max_sum = current_sum;
            if (current_sum < 0)
                current_sum = 0;
        }
        return max_sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("The max sum from  the all subarray is:" + maxSubArraySum(arr));
        sc.close();
    }
}
