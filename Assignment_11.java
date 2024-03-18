//Given an array A[] consisting of only 0s, 1s, and 2s. The task is to write a function that sorts the given array. 
//The functions should put all 0s first, then all 1s and all 2s in last.
//This problem is also the same as the famous “Dutch National Flag problem

import java.util.*;

public class Assignment_11 {
    public void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void sort_0S_1S_2S(int[] arr, int n) {
        int lo = 0;
        int mid = 0;
        int hi = n - 1;
        while (mid <= hi) {
            if (arr[mid] == 0) {
                swap(arr, lo, mid);
                lo++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, hi);
                hi--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Assignment_11 obj1 = new Assignment_11();
        obj1.sort_0S_1S_2S(arr, n);
        // System.out.println("The sorted array is:");
        // for(int i=0;i<n;i++)
        // System.out.print( " "+arr[i]); this is a way to print array using loop.
        System.out.println("The sorted array is: " + Arrays.toString(arr));
        // this is a another way to print the array without using loop
        sc.close();
    }
}
