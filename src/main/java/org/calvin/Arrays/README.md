# Array Problems

## AddOne

Given a int array/list, add 1 to it and return the resulting array.

**Example**:
```
[1,2,3,4] => [1,2,3,5]
```

**Example**:
```
[9,9,9] => [1,0,0,0]
```

## AnagramCounter

Checks how far apart 2 given strings are from being anagram

## AnagramValidity

Checks given 2 strings are anagram or not.

**Example 1:**

```text
Input: [1,4,3,2]

Output: 4
Explanation: n is 2, and the maximum sum of pairs is 4.
```

**Note:**
1. n is a positive integer, which is in the range of [1, 10000].
2. All the integers in the array will be in the range of [-10000, 10000].

## BoundSmallestWindowForSorted

Given an array of integers out of order, determine the bounds of the smallest window that must be sorted in order for the entire array to be sorted. 

**Example:**

Given [3, 7, 5, 6, 9], you should return (1, 3).

## CheckIfArrayElementsAreConsecutive

Checks if all the numbers in the array are consecutive.

## ChunkedPalindrome

Given a string, return the number of its possible chunked palindrome meaning a palindrome formed by substring in the case when it is not formed by characters of the string. For better understanding look at the example

**Examples**:
```
Input : ghiabcdefhelloadamhelloabcdefghi 
Output : 7
(ghi)(abcdef)(hello)(adam)(hello)(abcdef)(ghi)

Input : merchant
Output : 1
(merchant)

Input : antaprezatepzapreanta
Output : 11
(a)(nt)(a)(pre)(za)(tpe)(za)(pre)(a)(nt)(a)
```

## Combination Sum

Given a set of candidate numbers (without duplicates) and a target number, find all combinations in C where the candidate numbers sums to target number.

The same repeated number may be chosen from candidate unlimited times

NOTE:
 - All numbers will be positive integers
 - The solution set must not contain duplicate combinations

Example:

given [2,3,6,7] and target 7
output should be [ [7], [2,2,3] ]

## ContainsDuplicate

containsDuplicateFirst: Checks if input int array has any duplicate item.

containsDuplicateSecond: Variated method for solving duplicate.

containsNearbyDuplicate: Given an array of integers and an integer *k*, find out whether there are two distinct indices *i* and *j* in the array such that **nums[i]** = **nums[j]** and the **absolute** difference between *i* and *j* is at most *k*.

containsNearbyAlmostDuplicate: Given an array of integers, find out whether there are two distinct indices *i* and *j* in the array such that the **absolute** difference between **nums[i]** and **nums[j]** is at most *t* and the **absolute** difference between *i* and *j* is at most *k*.

## DistributeCandies

Given an integer array with **even** length, where different numbers in this array represent different **kinds** of 
candies. Each number means one candy of the corresponding kind. You need to distribute these candies **equally** in 
number to brother and sister. Return the maximum number of **kinds** of candies the sister could gain.

**Example 1**:

```
Input: candies = [1,1,2,2,3,3]
Output: 3
Explanation:
There are three different kinds of candies (1, 2 and 3), and two candies for each kind.
Optimal distribution: The sister has candies [1,2,3] and the brother has candies [1,2,3], too. 
The sister has three different kinds of candies. 
```

**Example 2**:

```
Input: candies = [1,1,2,3]
Output: 2
Explanation: For example, the sister has candies [2,3] and the brother has candies [1,1]. 
The sister has two different kinds of candies, the brother has only one kind of candies. 
```

## Find All Number Dissapeared in an Array

Given an array of itegers where 0 < a[i] <= n (n = size of array), some elements appear twice and others appear once

Find all the elements of [1,n] inclusive that do not appear in the array

 - Without extra spaces
 - Time Complexity: O(n)

**Example**:

```
Input:
[4,3,2,7,8,2,3,1]

Output:
[5,6]
```

## FindDisappearedNumbers

Given array of numbers, find all of the missing numbers. 

## FindDuplicates

Given an array *nums* containing *n* + 1 integers where each integer is between 1 and *n* (inclusive), prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.

**Note**:

1. You **must not** modify the array (assume the array is read only).
2. You must use only constant, O(1) extra space.
3. Your runtime complexity should be less than O(n<sup>2</sup>).
4. There is only one duplicate number in the array, but it could be repeated more than once.

## FindMaximumDiff

Given an array, find the maximum j – i such that arr[j] > arr[i]

## GasStation

There are *N* gas stations along a circular route, where the amount of gas at station *i* is `gas[i]`.

You have a car with an unlimited gas tank and it costs `cost[i]` of gas to travel from station i to its next station (*i*+1). You begin the journey with an empty tank at one of the gas stations.

Return the starting gas station's index if you can travel around the circuit once, otherwise return -1.

## GetLastNLog

You run a website and want to record the last N order ids in a log. 

Implement a data structure to accomplish this, with the following API:

record(order_id): adds the order_id to the log
get_last(i): gets the ith last element from the log. i is guaranteed to be smaller than or equal to N.
You should be as efficient with time and space as possible.

## HighestRAM

You have a log of multiple rams with running duration. Return the peak amount of rams.

## Intersection

- IntersectionSet

Given 2 int arrays, returns 1 array that contains all items intersected.

**Example 1**:

```text
Input: [3, 1, 4, 1, 5], k = 2
Output: 2
Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
Although we have two 1s in the input, we should only return the number of unique pairs.
```

**Example 2**:

```text
Input:[1, 2, 3, 4, 5], k = 1
Output: 4
Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).
```

**Example 3**:

```text
Input: [1, 3, 1, 5, 4], k = 0
Output: 1
Explanation: There is one 0-diff pair in the array, (1, 1).
```

**Note**:

1. The pairs (i, j) and (j, i) count as the same pair.
2. The length of the array won't exceed 10,000.
3. All the integers in the given input belong to the range: [-1e7, 1e7].

## LongestConsecutive

Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

## MajorityElement

Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

## MajorityElement 2

Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times. The algorithm should run in linear time and in O(1) space.

## MaximumProductSubarray

Find the contiguous subarray within an array (containing at least one number) which has the largest product.

For example, given the array `[2,3,-2,4]`, the contiguous subarray `[2,3]` has the largest product = 6.

## MaximumSumSubarray

Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array `[−2,1,−3,4,−1,2,1,−5,4]`, the contiguous subarray `[4,−1,2,1]` has the largest sum = 6.

## MeetingRooms

Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei), find the minimum number of conference rooms required.

**For example**
```
Given [[0, 30],[5, 10],[15, 20]],
return 2.
```

## MergeOverlapping

You are given an array of intervals - that is, an array of tuples (start, end). The array may not be sorted, and could contain overlapping intervals. Return another array where the overlapping intervals are merged.

**Example**:
```
[(1, 3), (5, 8), (4, 10), (20, 25)]

Return [(1, 3), (4, 10), (20, 25)] 
 
(5, 8) and (4, 10) can be merged into (4, 10)
```

## MergeKSortedArray

Merge incoming K sorted arrays into a single array.

## MergeSortedArray

Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

## Missing Number

Given an array containing n consecutive numbers taken from 0,1,2,...,n, find the one that is missing from the array.

## MoveZeros

Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

## NextGreaterElement

You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements are subset of nums2. Find all the next greater numbers for nums1's elements in the corresponding places of nums2.

## NonDecreasingArraySingleModification

You are given an array of integers in an arbitrary order. Return whether or not it is possible to make the array non-decreasing by modifying at most 1 element to any value.

We define an array is non-decreasing if array[i] <= array[i + 1] holds for every i (1 <= i < n).

**Example**:
 - [13, 4, 7] should return true, since we can modify 13 to any value 4 or less, to make it non-decreasing.
 - [13, 4, 1] however, should return false, since there is no way to modify just one element to make the array non-decreasing.

## PowerSet

Find PowerSet from a set.

Complexity: O(2^n)

The powerset of {1, 2, 3} is:

{{}, {1}, {2}, {3}, {1, 2}, {1, 3}, {2, 3}, {1, 2, 3}}

## ProductArrayExceptSelf

Given an array, find product of all element except itself.

Example:

```
[1,2,3] => [6,3,2]
```

## PushDominoes

Given a string "S" representing the initial state. 
 - S[i] = 'L', if the i-th domino has been pushed to the left 
 - S[i] = 'R', if the i-th domino has been pushed to the right 
 - S[i] = '.', if the i-th domino has not been pushed.

## RemoveDuplicateSortedArray

Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

## RemoveElement

Given an array and a value, remove all instances of that value in place and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

## ReshapeMatrix

In MATLAB, there is a very useful function called 'reshape', which can reshape a matrix into a new one with different size but keep its original data.

You're given a matrix represented by a two-dimensional array, and two positive integers r and c representing the row number and column number of the wanted reshaped matrix, respectively.

The reshaped matrix need to be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the 'reshape' operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.

**Example**

```
Input: 
nums = 
[[1,2],
 [3,4]]
r = 1, c = 4
Output: 
[[1,2,3,4]]
Explanation:
The row-traversing of nums is [1,2,3,4]. The new reshaped matrix is a 1 * 4 matrix, fill it row by row by using the previous list.
```

## Rotate

Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

## SlidingWindowMaximum

Given an array nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position. 

For each window, list maximum value of the `k` window in an array and return it.
