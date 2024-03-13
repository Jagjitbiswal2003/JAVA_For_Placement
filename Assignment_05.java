//Loops - For loops, While loops, 
//WAP to find the factorial of a number using while loop

import java.util.*;
public class Assignment_05
{
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
           System.out.println("Enter a number to find the factorial");
          int factrange = sc.nextInt();
             int i=1; int factorial=1;
          while(i<=factrange)
           {
                  factorial=factorial*i;
                  i++;
           }
             System.out.println("Factorial of " +factrange+ " is:"+factorial);
                   sc.close();
     }
}