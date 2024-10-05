# Permutation in String

### Problem Statement

Given two strings `s1` and `s2`, the task is to return `true` if `s2` contains any permutation of `s1` as a substring. In other words, return `true` if any permutation of `s1` is present as a contiguous substring in `s2`. Otherwise, return `false`.

### Example 1:

- **Input:**  
  `s1 = "ab"`,  
  `s2 = "eidbaooo"`
  
- **Output:**  
  `true`

- **Explanation:**  
  `s2` contains one permutation of `s1` as a substring ("ba").

### Example 2:

- **Input:**  
  `s1 = "ab"`,  
  `s2 = "eidboaoo"`
  
- **Output:**  
  `false`

### Constraints:

- `1 <= s1.length, s2.length <= 10^4`
- `s1` and `s2` consist of lowercase English letters.