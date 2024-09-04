# Find the Student that Will Replace the Chalk

## Problem Description

There are `n` students in a class numbered from `0` to `n - 1`. The teacher gives each student a problem starting with student number `0`, then moves to student number `1`, and so on until reaching student number `n - 1`. After that, the process restarts, beginning again with student number `0`.

You are given a 0-indexed integer array `chalk` and an integer `k`. There are initially `k` pieces of chalk. When student number `i` is given a problem to solve, they will use `chalk[i]` pieces of chalk to solve it. However, if the current number of chalk pieces is strictly less than `chalk[i]`, then student number `i` will be asked to replace the chalk.

Your task is to return the index of the student that will replace the chalk.

### Example 1:

**Input:**
```java
int[] chalk = {5, 1, 5};
int k = 22;
```
**Output :**
```
1
```
Explanation: The students go in turns as follows:
- Student number 0 uses 3 chalk so k = 22.
- Student number 1 uses 4 chalk so k = 18.
- Student number 2 uses 1 chalk so k = 17.
- Student number 3 uses 2 chalk so k = 15.
- Student number 0 uses 3 chalk so k = 12.
- Student number 1 uses 4 chalk so k = 8.
- Student number 2 uses 1 chalk so k = 7.
- Student number 3 uses 2 chalk so k = 5.
- Student number 0 uses 3 chalk so k = 2.
Student number 1 does not have enough chalk, so they will have to replace it.
 

