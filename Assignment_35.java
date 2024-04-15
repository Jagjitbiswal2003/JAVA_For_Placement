// Find the smallest element from a sorted and rotated array
//Ex- 
//Original sorted array - [3, 5, 7, 9, 11, 14, 15, 20, 22]
//After rotation of kth place here k = 5 
//We got this sorted and rotated array - [14, 15, 20, 22, 3, 5, 7, 9, 11]
//output - smallest element = 3
//In question the array is sorted and rotated you don't want to sort or rotate the array.
//You will find the smallest element from that array.

import java.util.*;

public class Assignment_35 {

    public static int find_smallest(int[] arr, int fi, int li) {
        while (fi < li) {
            int mid = fi + (li - fi) / 2;
            if (arr[mid] < arr[li])
                li = mid;
            else
                fi = mid + 1;
        }
        return arr[li];
        // Both the fi and li are indicate the smallest element in the array so you can
        // any of one.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int result = find_smallest(arr, 0, n - 1);
        System.out.println("The smallest element from the sorted and rotated array is :" + result);
        sc.close();
    }
}
