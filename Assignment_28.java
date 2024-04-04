//5.  Merge Sort    Time Complexity-O(nlogn) & Space Complexity-.

import java.util.*;

public class Assignment_28 {

    public static void Merge(int[] arr, int fi, int li) {
        // This function is used to merge two arrays
        int mid = (fi + li) / 2;

        int len1 = mid - fi + 1;
        int len2 = li - mid;

        // Create two temporary arrays
        int[] first = new int[len1];
        int[] second = new int[len2];

        // Copy the elements of the main array into two subarrays
        for (int i = 0; i < len1; i++) {
            first[i] = arr[fi + i];
        }

        for (int i = 0; i < len2; i++) {
            second[i] = arr[mid + 1 + i];
        }

        // Merge two arrays logic
        int index1 = 0;
        int index2 = 0;
        int mainarrayindex = fi;

        while (index1 < len1 && index2 < len2) {
            if (first[index1] <= second[index2]) {
                arr[mainarrayindex++] = first[index1++];
            } else {
                arr[mainarrayindex++] = second[index2++];
            }
        }

        // Copy remaining elements of first array
        while (index1 < len1) {
            arr[mainarrayindex++] = first[index1++];
        }

        // Copy remaining elements of second array
        while (index2 < len2) {
            arr[mainarrayindex++] = second[index2++];
        }
    }

    public static void MergeSort(int[] arr, int fi, int li) {

        // This function is used to sort the array using recursion.
        if (fi < li) {
            int mid = fi + (li - fi) / 2;

            // Sort left side of array
            MergeSort(arr, fi, mid);

            // Sort right side of array
            MergeSort(arr, mid + 1, li);

            // Merge the sorted halves
            Merge(arr, fi, li);

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        MergeSort(arr, 0, n - 1);
        System.out.println("After sorting the array:");
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
