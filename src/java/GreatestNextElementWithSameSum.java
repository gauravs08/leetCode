// GreatestNextElementWithSameSum.java
// This class provides a solution to find the smallest integer greater than a given number 'n'
// such that the sum of its digits is the same as the sum of the digits of 'n'.
// If 'n' is a power of ten (like 10, 100, 1000), the next such number is the next power of ten.
// Otherwise, the algorithm increments numbers greater than 'n' until it finds one with the same digit sum.

public class GreatestNextElementWithSameSum {

    public static int solution(int N) {
        int targetSum = digitSum(N);

        // Fast path: if N is a power of 10 (like 10, 100, 1000, etc.)
        if (targetSum == 1 && isPowerOfTen(N)) {
            return N * 10;
        }

        int candidate = N + 1;
        while (true) {
            if (quickDigitSum(candidate, targetSum)) {
                return candidate;
            }
            candidate++;
        }
    }

    private static boolean quickDigitSum(int num, int target) {
        // Checks if the sum of the digits of num equals the target sum
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            if (sum > target) return false;
            num /= 10;
        }
        return sum == target;
    }

    private static int digitSum(int num) {
        // Returns the sum of the digits of num
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    private static boolean isPowerOfTen(int num) {
        // Checks if num is a power of ten (e.g., 10, 100, 1000, ...)
        if (num < 1) return false;
        while (num % 10 == 0) {
            num /= 10;
        }
        return num == 1;
    }

    public static void main(String[] args) {
        // Test cases for the solution method
        System.out.println(solution(28));     // 37
        System.out.println(solution(734));    // 743
        System.out.println(solution(1990));   // 2089
        System.out.println(solution(1000));   // 10000 (fast path)
        System.out.println(solution(10));     // 100 (fast path)
        System.out.println(solution(999));    // 1089
    }
}
