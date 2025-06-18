# leetCode
Solutions to some of the leetCode challenges

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

### Problem 207: Course Schedule</b> [CourseScheduling207.java](src%2Fjava%2FCourseScheduling207.java)

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


### Problem X: balance parenthesis</b> [BalanceParenthesis.java](src%2Fjava%2FBalanceParenthesis.java)
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