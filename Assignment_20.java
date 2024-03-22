//Given an array, the task is to cyclically rotate the array clockwise by one time. 

//Examples:  
//Input: arr[] = {1, 2, 3, 4, 5}
//Output: arr[] = {5, 1, 2, 3, 4}

//Input: arr[] = {2, 3, 4, 5, 1}
//Output: {1, 2, 3, 4, 5}

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_20 {

    public static void cyclic_rotate_array(int[] arr, int n) {

        int last_el = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last_el;

        System.out.println("After rotating the array once: ");

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
        cyclic_rotate_array(arr, n);
        sc.close();
    }
}
