# Find Kth Bit in Nth Binary String

## Problem Description

Given two positive integers `n` and `k`, the binary string `Sn` is formed as follows:

- S1 = "0"
- Si = Si-1 + "1" + reverse(invert(Si-1)) for i > 1

Where:
- `+` denotes the concatenation operation.
- `reverse(x)` returns the reversed string `x`.
- `invert(x)` inverts all the bits in `x` (0 becomes 1 and 1 becomes 0).

The task is to return the k-th bit in `Sn`. It is guaranteed that `k` is valid for the given `n`.

For example, the first four strings in the sequence are:

- S1 = "0"
- S2 = "011"
- S3 = "0111001"
- S4 = "011100110110001"

### Example 1:
Input: `n = 3`, `k = 1`  
Output: `"0"`

**Explanation:** S3 is `"0111001"`. The 1st bit is `"0"`.

### Example 2:
Input: `n = 4`, `k = 11`  
Output: `"1"`

**Explanation:** S4 is `"011100110110001"`. The 11th bit is `"1"`.

## Constraints
- 1 <= n <= 20
- 1 <= k <= 2^n - 1