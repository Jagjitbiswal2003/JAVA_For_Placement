//Find common elements in three sorted arrays
//Given three Sorted arrays in non-decreasing order, print all common elements in these arrays.

//Examples: 
//Input: 
//ar1[] = {1, 5, 10, 20, 40, 80} 
//ar2[] = {6, 7, 20, 80, 100} 
//ar3[] = {3, 4, 15, 20, 30, 70, 80, 120} 
//Output: 20, 80

import java.util.*;

public class Assignment_21 {
    public static void find_common(int[] arr1, int[] arr2, int[] arr3) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                System.out.println("The common elements:" + arr1[i]);
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j])
                i++;
            else if (arr2[j] < arr3[k])
                j++;
            else
                k++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array1:");
        int n1 = sc.nextInt();
        System.out.println("Enter the length of array2:");
        int n2 = sc.nextInt();
        System.out.println("Enter the length of array3:");
        int n3 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        int[] arr3 = new int[n3];
        System.out.println("Enter the array1 elements :");
        for (int i = 0; i < n1; i++)
            arr1[i] = sc.nextInt();
        System.out.println("Enter the array1 elements :");
        for (int i = 0; i < n2; i++)
            arr2[i] = sc.nextInt();
        System.out.println("Enter the array1 elements :");
        for (int i = 0; i < n3; i++)
            arr3[i] = sc.nextInt();

        find_common(arr1, arr2, arr3);
        sc.close();
    }
}
