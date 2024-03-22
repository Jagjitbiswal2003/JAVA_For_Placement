//Given an array arr[] of size n and an integer target. 
//Find if there’s a triplet in the array which sums up to the given integer target.
//Array is in random order and duplicate elements are also there.
//Examples: 
//Input: array = {12, 3, 4, 1, 6, 9}, sum = 24; 
//Output: 12, 3, 9 

import java.util.*;
public class Assignment_17 {
  public static void find_three_sum(int[] arr, int target) {
    Arrays.sort(arr);
    boolean flag = false;
    for (int i = 0; i < arr.length; i++) { // traverse the whole array.
      if (i == 0 || arr[i] != arr[i - 1]) { // Ensure ith element is not duplicate.
        int low = i + 1;
        int high = arr.length - 1;
        while (low < high) {

          if (arr[low] + arr[high] == target - arr[i]) {
            System.out.println("The triplets are:");
            System.out.println(arr[low] + " ," + arr[i] + " and " + arr[high]);
            // handle the the duplicates of low and high elements.
            while (low < high && arr[low] == arr[low + 1])
              low++;
            while (low < high && arr[high] == arr[high - 1])
              high--;

            low++;
            high--;
            flag = true;
          } else if (arr[low] + arr[high] < target - arr[i])
            low++;
          else
            high--;
        }
      }
    }
    if (flag == false)
      System.out.println("There is no such triplets are exist in the array!");
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
    find_three_sum(arr, target);
    sc.close();
  }
}