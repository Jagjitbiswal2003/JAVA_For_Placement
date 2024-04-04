 // Linear Search in Array using Recursion.


import java.util.*;

public class Assignment_30 {

    public static void LinearSearch_recursion(int[] arr, int i, int S_element) {
        // Base case: If i reaches the end of the array
        if (i == arr.length) {
            System.out.println("The element " + S_element + " is not found in the array.");
            return;
        }

        // Check if the current element equals the search element
        if (arr[i] == S_element) {
            System.out.println("The element " + S_element + " is found at index: " + i);
            return;
        }

        // Recursion for the next index
        LinearSearch_recursion(arr, i + 1, S_element);
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
        LinearSearch_recursion(arr, 0, k);
        sc.close();
    }
}

    
    
  