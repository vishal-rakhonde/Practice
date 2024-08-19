/* 2 Keys Keyboard

There is only one character 'A' on the screen of a notepad. You can perform one of two operations on this notepad for each step:

Copy All: You can copy all the characters present on the screen (a partial copy is not allowed).
Paste: You can paste the characters which are copied last time.
Given an integer n, return the minimum number of operations to get the character 'A' exactly n times on the screen.

Example 1:

Input: n = 3
Output: 3

Explanation: Initially, we have one character 'A'.
In step 1, we use Copy All operation.
In step 2, we use Paste operation to get 'AA'.
In step 3, we use Paste operation to get 'AAA'.
Example 2:

Input: n = 1
Output: 0
 

Constraints:

1 <= n <= 1000
*/
class CommitSteps {
    private int targetLength;
    
    public int minSteps(int n) {
        if (n == 1) return 0;
        this.targetLength = n;
        return 1 + findMinSteps(1, 1);
    }
    
    private int findMinSteps(int currentLength, int clipboardLength) {
        if (currentLength == targetLength) return 0;
        if (currentLength > targetLength) return Integer.MAX_VALUE / 2;
        
        int copyAndPaste = 2 + findMinSteps(currentLength * 2, currentLength);
        int pasteOnly = 1 + findMinSteps(currentLength + clipboardLength, clipboardLength);
        
        return Math.min(copyAndPaste, pasteOnly);
    }
    
    public static void main(String[] args) {
        CommitSteps solution = new CommitSteps();
        int n = 5; 
        int result = solution.minSteps(n);
        System.out.println("Minimum steps to get " + n + " 'A's: " + result);
    }
}
