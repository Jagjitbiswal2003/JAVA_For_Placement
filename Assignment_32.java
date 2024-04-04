//Binary Search in Array using Recursion.
//For Binary Search the array must be Sorted.

import java.util.*;


public class Assignment_32 {
     
        public static void BinarySearch_recursion(int[] arr, int fi, int li, int S_element)
        {
            int mid = fi + (li - fi) / 2;
            
              // Base case
               if(fi > li)
                return ;

              if(arr[mid] == S_element)
              System.out.println("The element " + S_element + " is found at index: " + mid);

              else if(arr[mid] < S_element)
              BinarySearch_recursion(arr, mid+1, li, S_element);
             
              else
              BinarySearch_recursion(arr, li, mid-1, S_element);
                 
              }
        
    
    
    
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter the target element:");
        int k = sc.nextInt();
        BinarySearch_recursion(arr, 0, n - 1, k);
        sc.close();
     }
}
