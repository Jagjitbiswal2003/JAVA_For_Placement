//Given an array arr[] of size N-1 with integers in the range of [1, N], 
//the task is to find the missing number from the first N integers.
//Note: There are no duplicates in the list and only one missing number is there.
//***always use for-each loop.
//Examples: 
//Input: arr[] = {1, 2, 4, 6, 3, 7, 8}  Output: 5
//Explanation: Here the size of the array is 7, so the range will be [1, 8]. 
//The missing number between 1 to 8 is 5


public class Assignment_13 {
    public static void main(String[] args) {
            int[] arr = {1, 2, 3, 5};
            int n = arr.length + 1; // size of the original range
    
            int sum = 0;
            for (int num : arr) {
                sum += num;
            }
    
            int totalSum = (n * (n + 1)) / 2; // sum of first N natural numbers
            int missingNumber = totalSum - sum;
    
            System.out.println("The missing number is: " + missingNumber);
        }
    }
    
    
