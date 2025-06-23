// ZigzagConversion6.java
// This class implements the zigzag conversion of a string as described in LeetCode problem 6.
// The string is written in a zigzag pattern on a given number of rows and then read row by row.

public class ZigzagConversion6 {
    public String convert(String s, int numRows) {
        // If only one row or the string is too short, return as is
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        // Create an array of StringBuilders for each row
        StringBuilder[] rows = new StringBuilder[Math.min(numRows, s.length())];
        for (int i = 0; i < rows.length; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;      // Tracks the current row
        boolean goingDown = false; // Direction flag: true = moving down, false = moving up

        // Iterate over each character in the string
        for (char c : s.toCharArray()) {
            rows[currentRow].append(c); // Add character to the current row
            // Change direction if we are at the first or last row
            if (currentRow == 0) {
                goingDown = true;
            } else if (currentRow == numRows - 1) {
                goingDown = false;
            }
            // Move up or down depending on the direction
            currentRow += goingDown ? 1 : -1;
        }

        // Combine all rows to form the final result
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        ZigzagConversion6 solver = new ZigzagConversion6();
        String[] testStrings = {
            "PAYPALISHIRING", // Example from LeetCode
            "HELLO",          // Simple string
            "ABCDEFGHIJKLMN", // Longer string
            "A",              // Single character
            "AB",             // Two characters
            "",               // Empty string
            "ZIGZAGCONVERSION" // Custom test
        };
        int[] testRows = {3, 2, 4, 1, 2, 1, 5};
        for (int i = 0; i < testStrings.length; i++) {
            String input = testStrings[i];
            int rows = testRows[i];
            String result = solver.convert(input, rows);
            System.out.println("Input: '" + input + "', numRows: " + rows + " => Output: '" + result + "'");
        }
    }
}
