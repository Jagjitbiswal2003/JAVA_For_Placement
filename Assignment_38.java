// A string is a pangram string if it contains all the character of the alphabets ignoring the case of the alphabets.

//  Input: str = “Abcdefghijklmnopqrstuvwxyz”
//  Output: Yes
// Explanation: The given string contains all the letters from a to z (ignoring case).


    public class Assignment_38 {
        static int size = 26;
 
        // Function to check if ch is a letter
        static boolean isLetter(char ch)
        {
            if (!Character.isLetter(ch))
                return false;
     
            return true;
        }
     
        // Function to check if a string
        // contains all the letters from
        // a to z
        static boolean allLetter(String str,
                                 int len)
        {
            // Convert the given string
            // into lowercase
            str = str.toLowerCase();
     
            // Create a frequency array to
            // mark the present letters
            boolean[] present = new boolean[size];
     
            // Traverse for each character
            // of the string
            for (int i = 0; i < len; i++) {
     
                // If the current character
                // is a letter
                if (isLetter(str.charAt(i))) {
     
                    // Mark current letter as present
                    int letter = str.charAt(i) - 'a';
                    present[letter] = true;
                }
            }
     
            // Traverse for every letter
            // from a to z
            for (int i = 0; i < size; i++) {
     
                // If the current character
                // is not present in string
                // then return false,
                // otherwise return true
                if (!present[i])
                    return false;
            }
            return true;
        }
     
        // Driver Code
        public static void main(String args[])
        {
     
            // Given string str
            String str = "Abcdefghijklmnopqrstuvwxyz";
            int len = str.length();
     
            // Function Call
            if (allLetter(str, len))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }