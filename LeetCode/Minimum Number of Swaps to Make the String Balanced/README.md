# Minimum Number of Swaps to Make the String Balanced

## Problem Description

You are given a 0-indexed string `s` of even length `n`. The string consists of exactly `n / 2` opening brackets `'['` and `n / 2` closing brackets `']'`. The goal is to make the string **balanced** using the minimum number of swaps.

A string is considered **balanced** if and only if:
1. It is an empty string, or
2. It can be written as `AB`, where both `A` and `B` are balanced strings, or
3. It can be written as `[C]`, where `C` is a balanced string.

You may swap the brackets at any two indices any number of times.


## Examples

### Example 1
- **Input**: `s = "][]["`
- **Output**: `1`
- **Explanation**: By swapping index `0` with index `3`, the string becomes `"[[]]"`, which is balanced.

### Example 2
- **Input**: `s = "]]][[["`
- **Output**: `2`
- **Explanation**: 
  - Swap index `0` with index `4`: `s = "[]][]["`
  - Swap index `1` with index `5`: `s = "[[][]]"`

The resulting string is balanced: `"[[][]]"`.

### Example 3
- **Input**: `s = "[]"`
- **Output**: `0`
- **Explanation**: The string is already balanced.

## Constraints
- `n == s.length`
- `2 <= n <= 10^6`
- `n` is even.
- `s[i]` is either `'['` or `']'`.
- The number of opening brackets `'['` equals `n / 2`, and the number of closing brackets `']'` equals `n / 2`.
