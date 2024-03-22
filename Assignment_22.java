//Sort an array in wave form
//Given an unsorted array of integers, sort the array into a wave array. 

//Examples:
//Input:  arr[] = Given [1, 2, 3, 4]
//Output: arr[] =  [2, 1, 4, 3]

import java.util.*;

public class Assignment_22 {

    public static void wave_rotate_array(int[] arr, int n) {
        int i = 0;
        if (n == 0)
            System.out.println("Invalid Length");

        while (i < n) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
            i = i + 2;
         }
        System.out.println("Wave array is:");
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        wave_rotate_array(arr, n);
        sc.close();
    }
}
