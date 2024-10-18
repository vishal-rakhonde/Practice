# Count Number of Maximum Bitwise-OR Subsets

## Problem Description
Given an integer array `nums`, the goal is to find the **maximum possible bitwise OR** of a subset of `nums` and return the number of different non-empty subsets that achieve this maximum bitwise OR.

## Examples

### Example 1:
- **Input:** `nums = [3,1]`
- **Output:** `2`
- **Explanation:** The maximum possible bitwise OR of a subset is `3`. There are two subsets with this bitwise OR:
  - `[3]`
  - `[3,1]`

### Example 2:
- **Input:** `nums = [2,2,2]`
- **Output:** `7`
- **Explanation:** All non-empty subsets of `[2,2,2]` have a bitwise OR of `2`. There are \(2^3 - 1 = 7\) total subsets.

### Example 3:
- **Input:** `nums = [3,2,1,5]`
- **Output:** `6`
- **Explanation:** The maximum possible bitwise OR of a subset is `7`. There are 6 subsets that achieve this maximum OR:
  - `[3,5]`
  - `[3,1,5]`
  - `[3,2,5]`
  - `[3,2,1,5]`
  - `[2,5]`
  - `[2,1,5]`

## Constraints:
- `1 <= nums.length <= 16`
- `1 <= nums[i] <= 10^5`