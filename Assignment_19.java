//Given an array nums of size n, return the majority element.
//The majority element is the element that appears more than ⌊n / 2⌋ times. 
//**You  assume that the majority element always exists in the array.
//Example 1:
//Input: nums = [3,2,3]
//Output: 3
//This question is solved by using Moore's voting algorithm(***).
//Algorithim of Moore's voting algo-
//step-1
//Initialize a variable candidate with the first element of the array arr[0]. 
//This element is presumed to be the majority element initially.
//step-2
// Iterate through the array.
//For each element arr[i] in the array:
//If the current element matches the candidate, increment a counter (count) by 1.
//If the current element does not match the candidate, decrement the count by 1.
//If the count becomes 0, update the candidate to the current element and reset the count to 1.
//Step-3
//After the voting process, verify whether the candidate is indeed the majority element.
//Iterate through the array again and count the occurrences of the candidate.
//If the count of occurrences of the candidate is greater than or equal to half the length of the array (n / 2), then it is considered the majority element.
//If the condition is met, print the candidate as the majority element.
//If the condition is not met, it means no majority element was found, so print an appropriate message.

import java.util.*;

public class Assignment_19 {
    public static void find_majority_element(int[] arr, int n) {
        int candidate = arr[0];

        for (int i = 0; i < n; i++) {
            int count = 1;
            if (arr[i] == candidate)
                count++;
            else
                count--;

            if (count == 0) {
                candidate = arr[i];
                count = 1;
            }
        }
        // verify this is major element or not.
        int count = 0;
        for (int val : arr) {
            if (val == candidate)
                count++;
        }
        if (count >= n / 2)
            System.out.println("The majority elemnt in the array is: " + candidate);
        else
            System.out.println("We don't find the majority elemnt in the array");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        find_majority_element(arr, n);
        sc.close();
    }
}
