package Practice_01;
//In this program we make an simple Calculator using switch case
import java.util.*;

public class Assignment_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number for operation and the type of operation: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        char operation = sc.next().charAt(0);
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println("The addition of two number is: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("The substraction of two number is: " + result);
                break;
            case '*':
                result = num1 + num2;
                System.out.println("The multiplication of two number is: " + result);
                break;
            case '/':
                result = num1 + num2;
                System.out.println("The division of two number is: " + result);
                break;
            case '%':
                result = num1 + num2;
                System.out.println("The remainder of two number is: " + result);
                break;

            default:
                System.out.println("Please enter valid value and operation!");
                break;
        }
              sc.close();
    }
}
