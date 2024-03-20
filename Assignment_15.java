
//This is a 2-sum problem. Always use this method.
//Given an array A[] of n numbers and another number x, 
//the task is to check whether or not there exist two elements in A[] whose sum is exactly x.
//The array is of random order and duplicate elements also there. 
import java.util.*;

public class Assignment_15 {
    public static void find_two_sum(int[] arr, int target) {
        Arrays.sort(arr); // Sort the array.
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            if (arr[low] + arr[high] == target) {
                // handle the duplicates in the array.
                while (low < high && arr[low] == arr[low + 1])
                    low++;
                while (low < high && arr[high] == arr[high - 1])
                    high--;
                // if there is no duplicate then print the pair.
                System.out.println("The pairs with given sum is:");
                System.out.println(arr[low] + " and " + arr[high]);
                low++;
                high--;
            } else if (arr[low] + arr[high] < target)
                low++;
            else
                high--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = sc.nextInt();
        System.out.println("Enter the target sum:");
        int target = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        find_two_sum(arr, target);
        sc.close();
    }
}
