// RabinKarp Algo -

// The Rabin-Karp algorithm is a string-searching algorithm that finds patterns within a text using hashing




public class Assignment_40 {
    private static final int PRIME = 101;

    public static void main(String[] args) {
        String text = "ababcabababaabcabcabcabbcbabababca";
        String pattern = "abc";
        search(text, pattern);
    }

    public static void search(String text, String pattern) {
        int patternLength = pattern.length();
        int textLength = text.length();
        long patternHash = hash(pattern, patternLength);
        long textHash = hash(text, patternLength);

        for (int i = 0; i <= textLength - patternLength; i++) {
            if (patternHash == textHash && isEqual(text, pattern, i, i + patternLength - 1)) {
                System.out.println("Pattern found at index " + i);
            }
            if (i < textLength - patternLength) {
                textHash = reHash(text, textHash, patternLength, i);
            }
        }
    }

    public static long hash(String str, int length) {
        long hash = 0;
        for (int i = 0; i < length; i++) {
            hash += str.charAt(i) * Math.pow(PRIME, i);
        }
        return hash;
    }

    public static long reHash(String text, long oldHash, int patternLength, int index) {
        long newHash = oldHash - text.charAt(index);
        newHash /= PRIME;
        newHash += text.charAt(index + patternLength) * Math.pow(PRIME, patternLength - 1);
        return newHash;
    }

    public static boolean isEqual(String text, String pattern, int start, int end) {
        for (int i = start, j = 0; i <= end; i++, j++) {
            if (text.charAt(i) != pattern.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
