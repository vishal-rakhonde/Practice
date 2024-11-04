# String Compression III

## Problem Description
Given a string `word`, compress it using the following algorithm:

Begin with an empty string `comp`.While `word` is not empty, perform the following operation:
   - Remove the maximum length prefix of `word` consisting of a single character `c`, repeating at most 9 times.
   - Append the length of this prefix followed by the character `c` to `comp`.

Return the string `comp`.

## Examples

### Example 1:
**Input:** `word = "abcde"`  
**Output:** `"1a1b1c1d1e"`  
**Explanation:**  
- `comp` is initially empty.
- Each character "a", "b", "c", "d", and "e" is processed individually as a prefix of length 1.

### Example 2:
**Input:** `word = "aaaaaaaaaaaaaabb"`  
**Output:** `"9a5a2b"`  
**Explanation:**  
- `comp` is initially empty.
- "aaaaaaaaa" (9 times 'a') is appended as `"9a"`.
- "aaaaa" (5 times 'a') is appended as `"5a"`.
- "bb" (2 times 'b') is appended as `"2b"`.

## Constraints
- 1 <= word.length <= 2 * 10^5
- `word` consists only of lowercase English letters.
