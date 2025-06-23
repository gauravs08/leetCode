// LongestSubstringLength.java
// This class provides a method to find the length of the longest substring without repeating characters in a given string.
// The algorithm uses a sliding window approach with a HashMap to track the last seen index of each character.
// This ensures O(n) time complexity, where n is the length of the string.
// For problem details, see the README: ../../README.md (Problem 3: LongestSubstringLength)

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringLength {
    public static int lengthOfLongestSubstring(String s) {
        // Map to store characters and their last seen indices
        Map<Character, Integer> charMap = new HashMap<>();
        int maxLength = 0; // Stores the maximum length found
        int start = 0;     // Start index of the current window
        for (int end = 0; end < s.length(); end++) {
            // Get the current character at the end of the window
            char currentChar = s.charAt(end);
            // If the character is already in the map and its index is within the current window
            if (charMap.containsKey(currentChar)) {
                // Move the start to the next index after the last occurrence of currentChar
                start = Math.max(start, charMap.get(currentChar) + 1);
            }
            // Update the maximum length if a longer substring is found
            maxLength = Math.max(maxLength, end - start + 1);
            // Store/update the index of the current character
            charMap.put(currentChar, end);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        // Example test cases
        String s1 = "abcabcbb";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + lengthOfLongestSubstring(s1));

//        String s2 = "bbbbb";
//        System.out.println("Input: " + s2);
//        System.out.println("Output: " + lengthOfLongestSubstring(s2));
//
//        String s3 = "pwwkew";
//        System.out.println("Input: " + s3);
//        System.out.println("Output: " + lengthOfLongestSubstring(s3));
    }
}