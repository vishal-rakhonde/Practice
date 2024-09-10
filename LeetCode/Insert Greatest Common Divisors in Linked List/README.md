# Insert Greatest Common Divisors in Linked List

## Problem Description

Given the head of a linked list, where each node contains an integer value, insert a new node between every pair of adjacent nodes. The value of the new node should be the greatest common divisor (GCD) of the two adjacent node values.

After inserting the new nodes, return the modified linked list.

The greatest common divisor (GCD) of two numbers is the largest positive integer that evenly divides both numbers.

## Constraints

- The number of nodes in the list is in the range [1, 5000].
- Each node's value is between 1 and 1000 inclusive.

## Example

### Example 1:

- **Input**: `head = [18, 6, 10, 3]`
- **Output**: `[18, 6, 6, 2, 10, 1, 3]`
  
#### Explanation:
1. Insert GCD(18, 6) = 6 between 18 and 6.
2. Insert GCD(6, 10) = 2 between 6 and 10.
3. Insert GCD(10, 3) = 1 between 10 and 3.

Final linked list: `[18, 6, 6, 2, 10, 1, 3]`

### Example 2:

- **Input**: `head = [7]`
- **Output**: `[7]`

#### Explanation:
There are no pairs of adjacent nodes, so return the linked list as-is.