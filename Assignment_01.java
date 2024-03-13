
// This is the concept of if-else in which we check among 3 numbers which is greater number.

package Practice_01;
import java.util.*;
public class Assignment_01 {
    public int max_of_three_sum(int a, int b, int c) {
        
        if(a==b && a==c)
           return a;


        if (a > b) {
            if (a > c)
                return a;
            else
                return c;
        } else {
            if (b > c)
                return b;
            else
                return c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Assignment_01 obj = new Assignment_01();
        System.out.println("Max Of three Number is:");
        System.out.println(obj.max_of_three_sum(a, b, c));
        sc.close();
    }
}
