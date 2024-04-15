//Search an element in a sorted and rotated array 
// Ex- arr = [9, 11, 14, 15, 20, 22, 25, 1, 3, 5, 7]  search element = 22.
// output - 5

import java.util.*;

public class Assignment_36 {

    public static int find_minindex(int[] arr, int fi, int li) {
        int mid = fi + (li - fi) / 2;
        while (fi < li) {
            if (arr[mid] < arr[li])
                li = mid;
            else
                fi = mid + 1;
        }
        return li;
    }

    public static int binary_search(int[] arr, int fi, int li, int S_element) {

        while (fi <= li) {
            int mid = fi + (li - fi) / 2;
            if (arr[mid] == S_element)
                return mid;
            else if (arr[mid] < S_element)
                fi = mid + 1;
            else
                li = mid - 1;
        }
        return -1;
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
        int minindex = find_minindex(arr, 0, n - 1);
        int ans = binary_search(arr, 0, minindex - 1, k);
        if (ans == -1) {
            ans = binary_search(arr, minindex - 1, n - 1, k);
            System.out.println("The element: " + k + " index is: " + ans);
        } else
            System.out.println("The element: " + k + " index is: " + ans);

        sc.close();
    }

}
