
// Multi try-catch block


public class Assignment_47 {
    public static void main(String[] args) {
        try {
            // Some code that might throw an ArithmeticException
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException caught: " + e.getMessage());
        }

        try {
            // Some code that might throw a NullPointerException
            String str = null;
            int length = str.length();
            System.out.println("Length: " + length);
        } catch (NullPointerException e) {
            System.err.println("NullPointerException caught: " + e.getMessage());
        }

        try {
            // Some code that might throw a ArrayIndexOutOfBoundsException
            int[] arr = {1, 2, 3};
            System.out.println("Value at index 3: " + arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }

       
    }

    public static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }
}


