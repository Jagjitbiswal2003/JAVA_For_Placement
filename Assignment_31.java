//Binary Search in Array using Loop.
//For Binary Search the array must be Sorted.
//Time complexity - O(logn) and Space complexity - O(1).

import java.util.*;

public class Assignment_31 {

    public static void BinarySearch(int[] arr, int fi, int li, int S_element) {
       
        // if the user provide an un sorted array  then this is activated 
        // Arrays.sort(arr);
       
        // If User provides Wrong length i.e 0
        if (arr.length == 0) {
            System.out.println("Enter a valid length!");
            System.exit(0);
        }

        while (fi <= li) {
            // calculate mid value.
            int mid = fi + (li - fi) / 2;

            if (arr[mid] == S_element) {
                System.out.println("The element " + S_element + " is found at index: " + mid);
                break;
            } else if (arr[mid] < S_element) {
                fi = mid + 1;
            } else {
                li = mid - 1;
            }

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
        BinarySearch(arr, 0, n - 1, k);
        sc.close();
    }
}
