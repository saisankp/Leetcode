# <a href = "https://leetcode.com/problems/median-of-two-sorted-arrays/">Median of Two Sorted Arrays</a>

Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

Follow up: The overall run time complexity should be O(log (m+n)).

## Example 1:

Input: nums1 = [1,3], nums2 = [2] <br>
Output: 2.00000 <br>
Explanation: merged array = [1,2,3] and median is 2. <br>

## Example 2:

Input: nums1 = [1,2], nums2 = [3,4] <br>
Output: 2.50000 <br>
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5. <br>

## Example 3:

Input: nums1 = [0,0], nums2 = [0,0] <br>
Output: 0.00000 <br>

## Example 4:

Input: nums1 = [], nums2 = [1] <br>
Output: 1.00000 <br>

## Example 5: 

Input: nums1 = [2], nums2 = [] <br> 
Output: 2.00000 <br>

## Constraints:

-> nums1.length == m <br>
-> nums2.length == n <br>
-> 0 <= m <= 1000 <br>
-> 0 <= n <= 1000 <br>
-> 1 <= m + n <= 2000 <br>
-> -106 <= nums1[i], nums2[i] <= 106 <br>
