//2. Selection Sort -  Time Complexity-O(n^2) & Space Complexity-O(1).

import java.util.*;

public class Assignment_25 {

    public static void SelectionSort(int[] arr) {

        if (arr.length != 0) {
            if (arr.length == 1) {
                System.out.println("Array have atleast 2 elements!");
                System.exit(0);
            }
            for (int i = 0; i < arr.length - 1; i++) {
                int min_index = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[min_index] > arr[j]) {
                        min_index = j;
                    }
                }
                // swap
                int temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println("After sorting of array:");
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        SelectionSort(arr);
        sc.close();
    }
}
