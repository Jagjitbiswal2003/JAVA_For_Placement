
// Exception Handling

// An exception is an abnormal condition that arises in a code sequence occurred at run time. An exception is a runtime error.

// Exceptions can occur in the following cases:
// The input is not correct
// The Array indexes are out of range
// The file you try to open that does not exist
// The network connection is interrupted
// The class file you are loading is missing

// IOexception: when the input or output operation is failed or interpreted.

//FileNotFoundException : When an attempt to access a file that does not exists.

//ClassNotFoundException: When the class name is misspelled while executing the java command.

//RuntimeException: These are usually caused by program bugs.

//ArithmeticException: This exception represents situations where an illegal arithmetic operation is attempted.

//ArrayIndexOutOfBoundsException: An invalid index is used to access an element in the array.

//ClassCastException: An attempt was made to cast a reference value to a type that was not legal.

//IllegalArgumentException and NumberFormatException: The IllegalArgumentException is thrown programmatically to indicate that a method was called with an illegal or inappropriate argument. The class
//NumberFormatException is a subclass of the IllegalArgumentException class.

//IllegalStateException: When an operation is attempted, but the runtime environment or the application is not in an appropriate state for the requested operation.

//NullPointerException: This might involve calling an instance method using a reference that has the null value, or accessing a field using a reference that has the null value.

// try-catch block 

import java.util.*;

public class Assignment_46 {
   
    public static void division(int a, int b)
    {
          try{
         int result = a/b;
         System.out.println("The division of two numbers is " + result);
          }
          catch(ArithmeticException e){
             System.out.println("The error occur in division " + e);
          }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
          
         System.out.println("Enter the two numbers:");

        int a = sc.nextInt();
        int b = sc.nextInt();

        division(a, b);
        sc.close();
    }
}
