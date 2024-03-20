//This is a 2-sum problem.
//Given an array A[] of n numbers and another number x, 
//the task is to check whether or not there exist two elements in A[] whose sum is exactly x.
//The array is of random order and you find only one pair.
//This question is solved using Hashmap DS.

import java.util.*;

public class Assignment_16 {
    public static void find_two_sum_using_Hashmap(int[] arr, int target) {
        int secondno;
        int firstelemnt = 0;
        int secondelement = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            secondno = target - arr[i];
            if (map.containsKey(secondno)) {
                firstelemnt = map.get(arr[secondno]);
                secondelement = arr[i];
                break;
            }
            map.put(arr[i], i);
        }
        System.out.println("The pair elements is:");
        System.out.println(firstelemnt + " and " + secondelement);
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
        find_two_sum_using_Hashmap(arr, target);
        sc.close();
    }
}
