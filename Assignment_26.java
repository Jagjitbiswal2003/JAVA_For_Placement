//3. Insertio Sort -  Time Complexity-O(n^2) & Space Complexity-O(1).

import java.util.*;

public class Assignment_26 {
    public static void insertionSort(int[] arr) {
      
        if (arr.length != 0) {
            if (arr.length == 1) {
                System.out.println("Array have atleast 2 elements!");
                System.exit(0);
            }
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (arr[j] > current) {
                    arr[j + 1] = arr[j];
                } else
                    break;
            }
                 arr[j+1] = current ;
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
        insertionSort(arr);
        sc.close();
    }
}
