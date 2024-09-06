# Delete Nodes From Linked List Present in Array

## Problem Description

You are given an array of integers `nums` and the head of a linked list. Your task is to remove all nodes from the linked list that have values present in `nums`. The function should return the modified linked list.

### Example 1

- **Input**: 
  - `nums = [1, 2, 3]`
  - `head = [1, 2, 3, 4, 5]`
- **Output**: 
  - `[4, 5]`
- **Explanation**: 
  - Remove the nodes with values 1, 2, and 3, so the remaining linked list is `[4, 5]`.

### Example 2

- **Input**: 
  - `nums = [1]`
  - `head = [1, 2, 1, 2, 1, 2]`
- **Output**: 
  - `[2, 2, 2]`
- **Explanation**: 
  - Remove the nodes with value 1, leaving only the values 2.

### Example 3

- **Input**: 
  - `nums = [5]`
  - `head = [1, 2, 3, 4]`
- **Output**: 
  - `[1, 2, 3, 4]`
- **Explanation**: 
  - No node in the list has value 5, so the linked list remains unchanged.

## Constraints

- `1 <= nums.length <= 10^5`
- `1 <= nums[i] <= 10^5`
- All elements in `nums` are unique.
- The number of nodes in the linked list is in the range `[1, 10^5]`.
- `1 <= Node.val <= 10^5`
- The input is generated such that there is at least one node in the linked list that has a value not present in `nums`.

