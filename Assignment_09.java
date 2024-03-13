//check whether the number is perfect number or not using loop and function.

import java.util.*;
public class Assignment_09 {
     public void is_perfect(int number){
          int temp=number;  int sum=0;
          if (number <= 0) {
            System.out.println("The given number " + number + " is not valid");
            System.exit(0);
        }
          
          for(int i=1;i<number;i++){
                   if(number%i==0)
                     sum=sum+i;
             }
             if (temp == sum)
             System.out.println("The number " + temp + " is a perfect number");
         else
             System.out.println("The number " + temp + " is not a perfect number");
 
     }
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is perfect or not:");
        int number = sc.nextInt();
        Assignment_09 obj = new Assignment_09();
        obj.is_perfect(number);
        sc.close();
     }
}
