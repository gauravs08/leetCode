import java.util.HashMap;
import java.util.Map;

public class LongestSubstringLength {
    public static int lengthOfLongestSubstring(String s) {
        // Map to store characters and their last seen indices
        Map<Character, Integer> charMap = new HashMap<>();
        int maxLength = 0;
        int start = 0;
        for (int end = 0; end < s.length(); end++) {
            System.out.println("end:"+end);
            char currentChar = s.charAt(end);
            System.out.println("currentChar:" + currentChar);
            if (charMap.containsKey(currentChar)) {
                // Update the start index to the next index after the last occurrence of the current character
                System.out.println("MAX(start,CharIndex): max(" + start + ", " + (charMap.get(currentChar) + 1)+")");
                start = Math.max(start, charMap.get(currentChar) + 1);
                System.out.println("start:" + start);
            }
            // Update the maximum length if a longer substring is found
            maxLength = Math.max(maxLength, end - start + 1);
            System.out.println("maxLength:" + maxLength);
            // Store the index of the current character
            charMap.put(currentChar, end);
            System.out.println("CharMap:" + charMap);
            System.out.println("-------------");
        }

        return maxLength;
    }

    public static void main(String[] args) {
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