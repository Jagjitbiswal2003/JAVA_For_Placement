//Q.Trapping Rain Water or container with most water.
//You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

//Find two lines that together with the x-axis form a container, such that the container contains the most water.

//Return the maximum amount of water a container can store.

//Notice that you may not slant the container.
//Example-
//Input: height = [1,8,6,2,5,4,8,3,7]:  Output: 49.

import java.util.*;

public class Assignment_23 {
    public static int max_rain_water(int[] height) {
        int i = 0; // starting container position
        int j = height.length - 1; // ending container position
        int max_area = 0;

        if (height.length != 0) {
            while (i < j) {
                int hei = 0;
                int l = j - i;
                if (height[i] >= height[j]) {
                    hei = height[j];
                    j--;
                } else {
                    hei = height[i];
                    i++;
                }
                int current_area = l * hei; // diff. of indices * minimum height.
                // formula to calculate the area of container with i,j height.
                // l=difference of indices.(j-i).
                max_area = Math.max(max_area, current_area);
            }
        } else
            return -1;

        return max_area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of container:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the heights array for container:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("The max amount of water the container store is:" + max_rain_water(arr) + "sq.unit");
        sc.close();
    }
}
