# Lab: Working with ArrayLists and Maps in Java

## Objective:
The objective of this lab is to help you practice solving problems using **ArrayLists** and **Maps** in Java. These data structures are widely used to store and manipulate data efficiently. You will be given two problems to solve and will need to implement the solutions.

---

## Problem 1: Closest Number to Zero

### Problem Description:
Given an integer array `nums` of size `n`, return the number with the value closest to 0 in `nums`. If there are multiple answers, return the number with the largest value.

### Example 1:
**Input**:
```java
nums = [-4, -2, 1, 4, 8]
```
**Output**:
```java
1
```
**Explanation**:
- The distance from -4 to 0 is |-4| = 4.
- The distance from -2 to 0 is |-2| = 2.
- The distance from 1 to 0 is |1| = 1.
- The distance from 4 to 0 is |4| = 4.
- The distance from 8 to 0 is |8| = 8.

Thus, the closest number to 0 in the array is 1.

### Example 2:
**Input**:
```java
nums = [2, -1, 1]
```
**Output**:
```java
1
```
**Explanation**:
- 1 and -1 are both the closest numbers to 0, so 1 being larger is returned.

### Constraints:
- `1 <= n <= 1000`
- `-10^5 <= nums[i] <= 10^5`

---

## Problem 2: Subsequence Check

### Problem Description:
Given two strings `s` and `t`, return `true` if `s` is a subsequence of `t`, or `false` otherwise. A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters.

For example:
- `"ace"` is a subsequence of `"abcde"`.
- `"aec"` is not a subsequence of `"abcde"`.

### Example 1:
**Input**:
```java
s = "abc", t = "ahbgdc"
```
**Output**:
```java
true
```

### Example 2:
**Input**:
```java
s = "axc", t = "ahbgdc"
```
**Output**:
```java
false
```

### Constraints:
- `0 <= s.length <= 100`
- `0 <= t.length <= 10^4`
- `s` and `t` consist only of lowercase English letters.

---

## Instructions:

### Step 1: **ArrayList for Problem 1**
- Create a method to find the closest number to 0 in an array of integers. You will need to use an `ArrayList` to store and manipulate the numbers as you iterate over the array.

### Step 2: **Working with Strings for Problem 2**
- Create a method that checks if one string is a subsequence of another. You can use a simple loop or the `Map` data structure to handle this problem.

### Step 3: **Test Your Code**
- Once you have implemented both methods, write test cases to check if the solutions are correct for different inputs. Make sure to test edge cases such as when the array is empty or when one of the strings is empty.


## **Optional Challenges**:
   - For **Problem 1**, consider optimizing your solution to reduce the time complexity.
   - For **Problem 2**, ensure your solution handles edge cases such as empty strings and strings with no common characters.