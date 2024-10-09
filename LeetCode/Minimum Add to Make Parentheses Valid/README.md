# Minimum Add to Make Parentheses Valid

## Problem Description

A parentheses string is valid if and only if:

1. It is the empty string.
2. It can be written as AB (A concatenated with B), where A and B are valid strings.
3. It can be written as `(A)`, where A is a valid string.

You are given a parentheses string `s`. In one move, you can insert a parenthesis at any position in the string.

For example, if `s = "()))"`, you can insert an opening parenthesis to get `"(()))"` or a closing parenthesis to get `"())))"`.

### Goal

Return the **minimum number of moves** required to make the string `s` valid.

## Examples

### Example 1:
**Input**:  
`s = "())"`

**Output**:  
`1`

### Example 2:
**Input**:  
`s = "((("`

**Output**:  
`3`

## Constraints

- `1 <= s.length <= 1000`
- `s[i]` is either `'('` or `')'`.