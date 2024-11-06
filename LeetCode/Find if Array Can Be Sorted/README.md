# Find if Array Can Be Sorted

### Problem Description
You are given a 0-indexed array of positive integers `nums`.

In one operation, you can swap any two adjacent elements if they have the same number of set bits in their binary representation. You can perform this operation any number of times (including zero).

Return `true` if you can sort the array, else return `false`.

### Examples

#### Example 1
**Input:** `nums = [8, 4, 2, 30, 15]`  
**Output:** `true`  
**Explanation:**  
Binary representations and set bits:
- `2` (binary: `10`), `4` (binary: `100`), `8` (binary: `1000`) each have **one set bit**.
- `15` (binary: `1111`), `30` (binary: `11110`) each have **four set bits**.

Possible swaps:
1. Swap `8` and `4` → `[4, 8, 2, 30, 15]`
2. Swap `8` and `2` → `[4, 2, 8, 30, 15]`
3. Swap `4` and `2` → `[2, 4, 8, 30, 15]`
4. Swap `30` and `15` → `[2, 4, 8, 15, 30]`

The array becomes sorted, so we return `true`.

#### Example 2
**Input:** `nums = [1, 2, 3, 4, 5]`  
**Output:** `true`  
**Explanation:** The array is already sorted, so we return `true`.

#### Example 3
**Input:** `nums = [3, 16, 8, 4, 2]`  
**Output:** `false`  
**Explanation:** No sequence of allowed swaps can sort the array.

### Constraints
- `1 <= nums.length <= 100`
- `1 <= nums[i] <= 2^8`
