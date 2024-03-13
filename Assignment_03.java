//In this program we findout the person age (13 to onward) is eligible for vote or not using switch case. But
//switch case is not useful here.You have to use if-else. 

package Practice_01;

import java.util.*;

public class Assignment_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age here:");
        int age = sc.nextInt();
        switch (age) {
            case 18:
                System.out.println("The person is eligible for vote!");
                break;
            case 17:
            case 16:
            case 15:
            case 14:
            case 13:
                System.out.println("The person is eligible for vote!");
            default:
                break;
        }
        sc.close();
    }

}
