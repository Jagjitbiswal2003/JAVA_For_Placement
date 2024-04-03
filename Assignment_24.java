// Sorting of Array - 
//1.Bubble Sort(Assignment_24)  
//2.Selection Sort(Assignment_25)
//3.Insertion Sort(Assignment_26)
//4.Quick Sort(Assignment_27)
//5..Merge Sort(Assignment_28)

//1. Bubble Sort -  Time Complexity-O(n^2) & Space Complexity-O(1).

import java.util.*;

public class Assignment_24 {
    public static void BubbleSort(int[] arr) {
        if (arr.length != 0) {
            if (arr.length == 1) {
                System.out.println("Array have atleast 2 elements!");
                System.exit(0);
            }
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length-i-1; j++) {
                    if (arr[j] >= arr[j+1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
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
        BubbleSort(arr);
        sc.close();
    }
}
