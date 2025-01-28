# Java Data Structures Lab: ArrayLists, Maps, and LinkedLists

## Lab 1: ArrayLists in Java (Problem Solving)

### 1. Find the second largest number
Given an `ArrayList<Integer>` containing integers, write a method to find the second largest number in the list. Do not use any sorting algorithms.

### 2. Remove all duplicates
Given an `ArrayList<String>`, write a method to remove all duplicate values in the list while maintaining the order of the first occurrences. The list should only contain unique elements after the method runs.

### 3. Sum of all elements in a range
Given an `ArrayList<Integer>`, write a method to find the sum of all elements between two indices `startIndex` and `endIndex` (both inclusive). If the indices are out of bounds, the method should return 0.

### 4. Find if the list is a palindrome
Write a method to determine if an `ArrayList<Character>` forms a palindrome. A palindrome reads the same forwards and backwards. If it does, return `true`; otherwise, return `false`.

### 5. Find the longest sublist with consecutive elements
Given an `ArrayList<Integer>`, find the length of the longest sublist that contains consecutive numbers. For example, for the input `[10, 4, 20, 5, 1, 3, 2]`, the result should be `4` because `[4, 5, 1, 3]` is the longest consecutive sublist.

---

## Lab 2: Maps in Java (Problem Solving)

### 1. Frequency of Elements
Given a `List<String>`, write a method to count the frequency of each unique word and store the result in a `HashMap<String, Integer>`, where the key is the word and the value is the number of occurrences.

### 2. Merge Two Maps
Given two maps (`Map<String, Integer> map1` and `Map<String, Integer> map2`), write a method that merges both maps. If both maps contain the same key, sum their values. If a key is only in one map, simply add it to the result.

### 3. Find the Key with the Maximum Value
Given a `Map<String, Integer>`, write a method that finds the key associated with the maximum value. If there are multiple keys with the maximum value, return the first one encountered.

### 4. Sort a Map by Value
Write a method that takes a `Map<String, Integer>` and sorts it by value in descending order. Return the sorted map as a list of key-value pairs.

### 5. Group Students by Scores
Given a list of students and their scores (e.g., `List<Student> students` where `Student` is a class with `name` and `score` attributes), write a method that groups the students by score and returns a map where the key is the score and the value is a list of students with that score.

---

## Bonus

### LinkedList Duplicate Removal
Write a method that removes duplicates from a `LinkedList<Integer>` without using additional memory (i.e., no HashSets or ArrayLists). The order of the elements should be maintained.

