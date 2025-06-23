# leetCode
Solutions to some of the leetCode challenges

### Problem 1: TwoSum [TwoSum.java](src/java/TwoSum.java)
<details>
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
</details>

### Problem 3: [LongestSubstringLength](src/java/LongestSubstringLength.java)
<details>
‘Longest Substring Without Repeating Characters.’ Given a string, the task is to find the length of the longest substring in the string that does not contain any repeating characters. This problem is often used as a basis for other more complex problems and has applications in a wide range of fields, including natural language processing, bioinformatics, and machine learning.

Problem:
Given a string s, find the length of the longest substring without repeating characters.
Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: 1

Explanation: The answer is "b", with the length of 1.

Example 3:

Input: s = "pwwkew"

Output: 3

Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
</details>

### Problem 207: Course Schedule</b> [CourseScheduling207.java](src/java/CourseScheduling207.java)

<details>There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.


For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
Return true if you can finish all courses. Otherwise, return false.

Example 1:
Input: numCourses = 2, prerequisites = [[1,0]]
Output: true
Explanation: There are a total of 2 courses to take.
To take course 1 you should have finished course 0. So it is possible.

Example 2:
Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
Output: false
Explanation: There are a total of 2 courses to take.
To take course 1 you should have finished course 0, and to take course 0 you should also have finished course 1. So it is impossible.
</details>


### Problem X: balance parenthesis</b> [BalanceParenthesis.java](src/java/BalanceParenthesis.java)
<details>
https://leetcode.com/problems/valid-parentheses/
20 Valid Parentheses
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false

Example 4:
Input: s = "([])"
Output: true

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
</details>

### Problem 26: Remove Duplicates from Sorted Array [RemoveDuplicatesFromSortedArray.java](src/java/RemoveDuplicatesFromSortedArray.java)
<details>
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.
Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.



Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).


Constraints:

1 <= nums.length <= 3 * 104
-100 <= nums[i] <= 100
nums is sorted in non-decreasing order.
</details>


### Problem 111: Greatest next number with same sum [GreatestNextNumberWithSameSum.java](src/java/GreatestNextNumberWithSameSum.java)
<details>
which, given an integer N, returns the smallest integer that is greater than N and the sum of whose digits is equal to the sum of the digits of N.
Examples:

1. Given N = 28, your function should return 37. The sum of the digits of 28 is equal to 2 + 8 = 10. The subsequent numbers are (with the sum of their digits in brackets): 29 (11), 30 (3), 31 (4), 32 (5), 33 (6), 34 (7), 35 (8), 36 (9) and 37 (10). 37 is the smallest number bigger than 28 whose digits add up to 10.

2. Given N = 734, your function should return 743. The sum of the digits of 734 and 743 are equal 7 + 3 + 4 = 7+ 4 + 3 = 14. No other integer between 735 and 742 adds up to 14.

3. Given N = 1990, your function should return 2089. The sum of the digits of both numbers is equal to 19 and there is no other integer between them with the same sum of digits.

4. Given N = 1000, your function should return 10000. The sum of the digits of both numbers is equal to 1 and there is no other number integer between them with the same sum of digits.
</details>

### Problem 1253: Reconstruct a 2-Row Binary Matrix [Reconstruct2RowBinaryMatrix.java](src/java/Reconstruct2RowBinaryMatrix.java)
<details>
https://leetcode.com/problems/reconstruct-a-2-row-binary-matrix/

Given the following details of a matrix with n columns and 2 rows :

The matrix is a binary matrix, which means each element in the matrix can be 0 or 1.
The sum of elements of the 0-th(upper) row is given as upper.
The sum of elements of the 1-st(lower) row is given as lower.
The sum of elements in the i-th column(0-indexed) is colsum[i], where colsum is given as an integer array with length n.
Your task is to reconstruct the matrix with upper, lower and colsum.

Return it as a 2-D integer array.

If there are more than one valid solution, any of them will be accepted.

If no valid solution exists, return an empty 2-D array.


```
Example 1:
Input: upper = 2, lower = 1, colsum = [1,1,1]
Output: [[1,1,0],[0,0,1]]
Explanation: [[1,0,1],[0,1,0]], and [[0,1,1],[1,0,0]] are also correct answers.
```

```
Example 2:
Input: upper = 2, lower = 3, colsum = [2,2,1,1]
Output: []
```
```
Example 3:
Input: upper = 5, lower = 5, colsum = [2,1,2,0,1,0,1,2,0,1]
Output: [[1,1,1,0,1,0,0,1,0,0],[1,0,1,0,0,0,1,1,0,1]]
```

```
Constraints:

1 <= colsum.length <= 10^5
0 <= upper, lower <= colsum.length
0 <= colsum[i] <= 2
```
</details>


### Problem 111: Palindrome Integer Without String or Additional Memory [PalindromeInteger.java](src/java/PalindromeInteger.java)
<details>
https://leetcode.com/problems/palindrome-number/
Write a function that determines if an integer is a palindrome without converting it to a string or using additional memory.
Given an integer x, return true if x is a palindrome, and false otherwise.
An integer is a palindrome when it reads the same backward as forward. For example, 121 is a palindrome while 123 is not.

````
Example 1:
Input: x = 121
Output: true
Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
Example 4:
Input: x = -101
Output: false
Constraints:
-2^31 <= x <= 2^31 - 1
````
</details>
