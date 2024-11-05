# Minimum Number of Changes to Make Binary String Beautiful

## Problem Description
You are given a 0-indexed binary string `s` of even length. A string is considered **beautiful** if it can be partitioned into one or more substrings such that:
1. Each substring has an even length.
2. Each substring contains only `1`s or only `0`s.

You can change any character in `s` to either `0` or `1`. Return the minimum number of changes required to make `s` beautiful.

## Examples

### Example 1:
**Input:** `s = "1001"`  
**Output:** `2`  
**Explanation:**  
- Changing `s[1]` to `1` and `s[3]` to `0` results in the string `"1100"`, which can be partitioned as `"11|00"`.
- This is the minimum number of changes needed to make the string beautiful.

### Example 2:
**Input:** `s = "10"`  
**Output:** `1`  
**Explanation:**  
- Changing `s[1]` to `1` results in the string `"11"`, which is beautiful as it can be partitioned as `"11"`.

### Example 3:
**Input:** `s = "0000"`  
**Output:** `0`  
**Explanation:**  
- The string `"0000"` is already beautiful and requires no changes.

## Constraints
-  2 <= s.length <= 105
- `s` has an even length.
- `s[i]` is either `'0'` or `'1'`.
