// Linear Search in Array using Loop.

//Time complexity - O(n) and Space complexity - O(1).

import java.util.*;

public class Assignment_29 {

    public static void LinearSearch(int[] arr, int S_element) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == S_element) {
                System.out.println("The element " + " is found at index:" + i);
                break;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        arr[i] = sc.nextInt();
        System.out.println("Enter the target element:");
        int k = sc.nextInt();
        LinearSearch(arr, k);
        sc.close();
    }
}
