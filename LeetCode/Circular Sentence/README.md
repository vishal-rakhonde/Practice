# Circular Sentence

## Problem Description
A sentence is defined as a list of words separated by a single space, with no leading or trailing spaces. Each word consists only of uppercase and lowercase English letters, where uppercase and lowercase letters are distinct.

A sentence is **circular** if:
1. The last character of each word is equal to the first character of the next word.
2. The last character of the last word is equal to the first character of the first word.

Given a string `sentence`, return `true` if it is circular; otherwise, return `false`.

## Examples

### Example 1:
**Input:** `sentence = "leetcode exercises sound delightful"`  
**Output:** `true`  
**Explanation:**  
- The words in sentence are `["leetcode", "exercises", "sound", "delightful"]`.
- The last character of each word matches the first character of the next word, and the last character of the last word matches the first character of the first word.

### Example 2:
**Input:** `sentence = "eetcode"`  
**Output:** `true`  
**Explanation:**  
- The sentence has one word, `["eetcode"]`.
- The last character is the same as the first character, so it is circular.

### Example 3:
**Input:** `sentence = "Leetcode is cool"`  
**Output:** `false`  
**Explanation:**  
- The words in sentence are `["Leetcode", "is", "cool"]`.
- The last character of "Leetcode" does not match the first character of "is".

## Constraints
- 1 <= sentence.length <= 500
- `sentence` consists only of lowercase and uppercase English letters and spaces.
- Words in `sentence` are separated by a single space with no leading or trailing spaces.
- There are no leading or trailing spaces.
