//4.  Quick Sort    Time Complexity-O(n logn) & Space Complexity-O(1).

import java.util.*;

public class Assignment_27 {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int fi, int li) {
        // This function return the pivot index only

        // step-1
        int pivot = arr[fi]; // assume the first element of array is pivot

        // step-2 count the number of elements which smaller that pivot element.
        int count = 0;
        for (int i = fi + 1; i <= li; i++) {
            if (arr[i] <= pivot)
                count++;
        }
        // step-3 Place the pivot element at it's correct position of array
        int pivotindex = fi + count;
        swap(arr, pivotindex, fi);

        // step-4 After placed the pivot element in its correct position handle the left
        // and right of the pivot
        int i = fi;
        int j = li;

        while (i < pivotindex && j > pivotindex) {

            // if the left element is smaller than pivot element the don't do anythin just
            // i++
            while (arr[i] < pivot)
                i++;
            // if the right element is greater than pivot element the don't do anythin just
            // j--
            while (arr[j] > pivot)
                j--;

            // if the left element is greater than pivot or the right element is smaller
            // than pivot element then swap
            if (i < pivotindex && j > pivotindex) {
                swap(arr, i, j);
                i++;
                j--;
            }

        }

        return pivotindex;
    }

    public static void quickSort(int[] arr, int fi, int li) {
        // this function is used to sort the arry using recursion.

        // base case -
        if (fi >= li)
            return;

        // partition function return the perfect position index of the pivot element
        int pivot = partition(arr, fi, li);

        // sort the left side array using recursion
        quickSort(arr, fi, pivot - 1); // sort the array from 0th index to pivot-1 index.

        // sort the right side array using recursion
        quickSort(arr, pivot + 1, li); // sort the array from pivot+1 index to last index.

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        quickSort(arr, 0, n - 1);
        System.out.println("After sorting of array:");
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
