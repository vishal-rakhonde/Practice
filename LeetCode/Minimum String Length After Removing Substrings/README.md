# Minimum String Length After Removing Substrings

## Problem Statement

You are given a string `s` consisting only of uppercase English letters.

You can apply some operations to this string where, in one operation, you can remove any occurrence of one of the substrings "AB" or "CD" from `s`.

Your task is to return the **minimum possible length** of the resulting string after applying the operations optimally.

Note that the string concatenates after removing the substring and could produce new "AB" or "CD" substrings.

### Example 1:
- **Input:** `s = "ABFCACDB"`
- **Output:** `2`
- **Explanation:**
  1. Remove the substring "AB" from "ABFCACDB", resulting in `s = "FCACDB"`.
  2. Remove the substring "CD" from "FCACDB", resulting in `s = "FCAB"`.
  3. Remove the substring "AB" from "FCAB", resulting in `s = "FC"`.
  
  The final string length is 2, which is the minimum possible length.

### Example 2:
- **Input:** `s = "ACBBD"`
- **Output:** `5`
- **Explanation:** No "AB" or "CD" substrings exist, so no operations can be performed. The string length remains 5.

## Constraints:
- `1 <= s.length <= 100`
- The string `s` consists only of uppercase English letters.