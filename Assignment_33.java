// Find  the first and last index of an element using binary search. 
// Input arr - [1,2,3,4,4,4,4,5,6,7]  element-4
// output - 3(first index of 4)
// output - 6(last index of 4)

import java.util.*;

public class Assignment_33 {

    public static int first_index(int[] arr, int fi, int li, int S_element) {
        if (arr.length == 0) {
            System.out.println("Enter a valid length!");
            System.exit(0);
        }
        int result = 0;
        while (fi <= li) {
            // calculate mid value.
            int mid = fi + (li - fi) / 2;

            if (arr[mid] == S_element) {
                result = mid;
                li = mid - 1;
            } else if (arr[mid] < S_element) {
                fi = mid + 1;
            } else {
                li = mid - 1;
            }
        }
        return result;
    }

    public static int last_index(int[] arr, int fi, int li, int S_element) {
        if (arr.length == 0) {
            System.out.println("Enter a valid length!");
            System.exit(0);
        }
        int result = 0;
        while (fi <= li) {
            // calculate mid value.
            int mid = fi + (li - fi) / 2;

            if (arr[mid] == S_element) {
                result = mid;
                fi = mid + 1;
            } else if (arr[mid] < S_element) {
                fi = mid + 1;
            } else {
                li = mid - 1;
            }
        }
        return result;
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
        System.out.println("The first index of element:" + first_index(arr, 0, n - 1, k));
        System.out.println("The last index of element:" + last_index(arr, 0, n - 1, k));
        sc.close();
    }
}
