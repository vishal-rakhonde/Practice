# Longest Subarray With Maximum Bitwise AND

## Problem Description

You are given an integer array `nums` of size `n`. Consider a non-empty subarray from `nums` that has the maximum possible bitwise AND. In other words, let `k` be the maximum value of the bitwise AND of any subarray of `nums`. Then, only subarrays with a bitwise AND equal to `k` should be considered.

Return the length of the longest such subarray.



### Examples

#### Example 1:
**Input :** 
```
nums = [1, 2, 3, 3, 2, 2]
```
**Output :**

```
2
```
#### Example 2:
**Input :** 
```
nums = [1, 2, 3, 4]
```
**Output :**

```
1
```
### Constraints
- `1 <= nums.length <= 10^5`
- `1 <= nums[i] <= 10^6`