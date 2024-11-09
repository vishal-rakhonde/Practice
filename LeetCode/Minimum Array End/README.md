# Minimum Array End

## Problem Description

You are given two integers `n` and `x`. You have to construct an array of positive integers `nums` of size `n` where, for every `0 <= i < n - 1`, `nums[i + 1]` is greater than `nums[i]`, and the result of the bitwise AND operation between all elements of `nums` is `x`.

The goal is to find the **minimum possible value** of `nums[n - 1]` (the last element of the array).

## Examples

### Example 1
**Input:**  
`n = 3`, `x = 4`  
**Output:**  
`6`  
**Explanation:**  
The array `nums` can be `[4, 5, 6]`, and its last element is `6`. The bitwise AND operation on all elements `[4, 5, 6]` results in `4`, which equals `x`.

### Example 2
**Input:**  
`n = 2`, `x = 7`  
**Output:**  
`15`  
**Explanation:**  
The array `nums` can be `[7, 15]`, and its last element is `15`. The bitwise AND operation on `[7, 15]` results in `7`, which equals `x`.

## Constraints

- `1 <= n, x <= 10^8`