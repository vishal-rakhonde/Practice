# Rank Transform of an Array

## Problem Statement

Given an array of integers `arr`, the task is to replace each element with its rank. The rank represents how large the element is, and follows these rules:

1. **Rank** is an integer starting from 1.
2. The larger the element, the larger the rank.
3. If two elements are equal, their rank must be the same.
4. Rank should be as small as possible.

### Example 1:
**Input :**
```
Input: arr = [40,10,20,30] 
```
**Output :**
```
 [4,1,2,3]
 ```
 **Explanation:**  
- 40 is the largest element, so it gets rank 4.  
- 10 is the smallest element, so it gets rank 1.  
- 20 is the second smallest element, so it gets rank 2.  
- 30 is the third smallest element, so it gets rank 3.

### Example 2:
**Input :**
```
arr = [100,100,100] 
```
 **Output :**
```
[1,1,1]
```
**Explanation:**  
- Since all elements are the same, they all share the same rank of 1.

### Example 3:
**Input :**
```
arr = [37,12,28,9,100,56,80,5,12]  
```
 **Output :**
```
[5,3,4,2,8,6,7,1,3]
```
**Explanation:**  
- The elements in ascending order are [5, 9, 12, 12, 28, 37, 56, 80, 100].
- 5 gets rank 1, 9 gets rank 2, 12 gets rank 3, and so on.

## Constraints:
- `0 <= arr.length <= 10^5`
- `-10^9 <= arr[i] <= 10^9`