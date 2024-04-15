//Count the ocurrence of a given element in the array using binary search
//Input - [1,3,5,5,5,6,7]  element - 5 output - 3  element - 8  output - 0

import java.util.*;

public class Assignment_34 {
    public static int first_index(int[] arr, int fi, int li, int S_element) {
        if (arr.length == 0) {
            System.out.println("Enter a valid length!");
            System.exit(0);
        }
        int result1 = 0;
        while (fi <= li) {
            // calculate mid value.
            int mid = fi + (li - fi) / 2;

            if (arr[mid] == S_element) {
                result1 = mid;
                li = mid - 1;
            } else if (arr[mid] < S_element) {
                fi = mid + 1;
            } else {
                li = mid - 1;
            }
        }
        if (fi > li)
            return -1;

        return result1;
    }

    public static int last_index(int[] arr, int fi, int li, int S_element) {
        if (arr.length == 0) {
            System.out.println("Enter a valid length!");
            System.exit(0);
        }
        int result2 = 0;
        while (fi <= li) {
            // calculate mid value.
            int mid = fi + (li - fi) / 2;

            if (arr[mid] == S_element) {
                result2 = mid;
                fi = mid + 1;
            } else if (arr[mid] < S_element) {
                fi = mid + 1;
            } else {
                li = mid - 1;
            }
        }
        if (fi > li)
            return -1;

        return result2;

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
        int count1 = first_index(arr, 0, n - 1, k);
        int count2 = last_index(arr, 0, n - 1, k);

        int freq = count2 - count1 + 1;
        if (count1 == -1 && count2 == -1)
            System.out.println("The element is not present in array");

        System.out.println("The ocurrance of element is: " + freq);
        sc.close();
    }
}
