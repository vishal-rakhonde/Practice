# The Number of the Smallest Unoccupied Chair

## Problem Description
There is a party where `n` friends, numbered from `0` to `n - 1`, are attending. The party has an infinite number of chairs, numbered from `0` to infinity. When a friend arrives, they sit on the smallest unoccupied chair.

- If chairs 0, 1, and 5 are occupied when a friend arrives, they will sit on chair number 2.
- When a friend leaves, their chair becomes unoccupied immediately, and if another friend arrives at the same moment, they can take that chair.

You are given a 2D integer array `times` where `times[i] = [arrival_i, leaving_i]`, representing the arrival and departure times of the `i-th` friend. Additionally, you are given an integer `targetFriend`. All arrival times are distinct.

Your task is to return the chair number that the friend `targetFriend` will sit on.

## Example 1:

**Input:**
```
times = [[1,4],[2,3],[4,6]], targetFriend = 1
```

**Output:**
```
1
```
#### Explanation:
- Friend 0 arrives at time 1 and sits on chair 0.
- Friend 1 arrives at time 2 and sits on chair 1.
- Friend 1 leaves at time 3 and chair 1 becomes empty.
- Friend 0 leaves at time 4 and chair 0 becomes empty.
- Friend 2 arrives at time 4 and sits on chair 0.
Since friend 1 sat on chair 1, we return 1.

**Input:**
```
times = [[3,10],[1,5],[2,6]], targetFriend = 0
```
**Output:**
```
2
```
#### Explanation:
- Friend 1 arrives at time 1 and sits on chair 0.
- Friend 2 arrives at time 2 and sits on chair 1.
- Friend 0 arrives at time 3 and sits on chair 2.
- Friend 1 leaves at time 5 and chair 0 becomes empty.
- Friend 2 leaves at time 6 and chair 1 becomes empty.
- Friend 0 leaves at time 10 and chair 2 becomes empty.
Since friend 0 sat on chair 2, we return 2.

## Problem Constraints
- `n == times.length`
- `2 <= n <= 10^4`
- `times[i].length == 2`
- `1 <= arrival_i < leaving_i <= 10^5`
- `0 <= targetFriend <= n - 1`
- Each `arrival_i` time is distinct.