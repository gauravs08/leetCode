// LongestPalindromicSubstring.java
// This class finds the longest palindromic substring in a given string using the expand-around-center approach.
// For each character (and each pair of characters), it expands outwards to find the longest palindrome centered there.
// Time complexity: O(n^2), Space complexity: O(1)

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        // Handle edge cases: null or empty string
        if (s == null || s.isEmpty()) return "";
        int start = 0, end = 0; // Indices of the longest palindrome found

        // Iterate through each character in the string
        for (int i = 0; i < s.length(); i++) {
            // Check for odd-length palindrome centered at i
            int len1 = expandAroundCenter(s, i, i);
            // Check for even-length palindrome centered between i and i+1
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            // Update start and end if a longer palindrome is found
            if (len > end - start) {
                start = i - (len - 1) / 2;  // go to center for odd (len-1)/2 or for even len/2 and then subtract index to go to start
                end = i + len / 2;  // center + index to go to end
            }
        }
        // Return the longest palindromic substring
        return s.substring(start, end + 1);
    }

    // Helper method to expand around the given center and return the length of the palindrome
    private int expandAroundCenter(String s, int left, int right) {
        // Expand as long as the characters at left and right are equal and within bounds
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Return the length of the palindrome found
        return right - left - 1;
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring solver = new LongestPalindromicSubstring();
        String[] testCases = {
            "babad",    // Expected: "bab" or "aba"
//            "cbbd",     // Expected: "bb"
//            "a",        // Expected: "a"
//            "ac",       // Expected: "a" or "c"
//            "racecar",  // Expected: "racecar"
//            "forgeeksskeegfor", // Expected: "geeksskeeg"
//            "",         // Expected: ""
//            "abccba",   // Expected: "abccba"
//            "noon",     // Expected: "noon"
//            "abcda"     // Expected: "a"
        };
        for (String s : testCases) {
            System.out.println("Input: '" + s + "' => Longest Palindromic Substring: '" + solver.longestPalindrome(s) + "'");
        }
    }
}
