// PalindromeInteger.java
// This class provides a method to check if a given integer is a palindrome.
// A palindrome is a number that reads the same backward as forward (e.g., 121, 12321).
// The solution avoids converting the integer to a string for efficiency.

public class PalindromeInteger {
    public static boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }
        int reversed = 0;
        int temp = x;
        while (temp != 0) {
            int rem = temp % 10;
            reversed = reversed * 10 + rem;
            temp /= 10;
        }
        return x == reversed || x == reversed / 10;
    }

    public static void main(String[] args) {
        // Test cases for isPalindrome
        int[] testCases = {-101, 121, -121, 10, 0, 12321, 123321, 12345, 1, 22, 1001, 1000021};
        for (int x : testCases) {
            System.out.println(x + " = " + isPalindrome(x));
        }
    }
}
