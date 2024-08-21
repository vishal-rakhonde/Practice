/* Strange Printer

There is a strange printer with the following two special properties:

The printer can only print a sequence of the same character each time.
At each turn, the printer can print new characters starting from and ending at any place and will cover the original existing characters.
Given a string s, return the minimum number of turns the printer needed to print it.

Example 1:
Input: s = "aaabbb"

Output: 2
Explanation: Print "aaa" first and then print "bbb".

Example 2:
Input: s = "aba"

Output: 2
Explanation: Print "aaa" first and then print "b" from the second place of the string, which will cover the existing character 'a'.
 

Constraints:

1 <= s.length <= 100
s consists of lowercase English letters.
*/

import java.util.Arrays;

public class StrangePrinterSolution {
    public int strangePrinter(String s) {
        int n = s.length();
        char[] sChar = s.toCharArray();
        int[][] dp = new int[n][n];
        for (int[] in : dp) Arrays.fill(in, -1);

        java.util.function.BiFunction<Integer, Integer, Integer> Util = new java.util.function.BiFunction<>() {
            @Override
            public Integer apply(Integer i, Integer j) {
                if (i > j) return 0;

                if (dp[i][j] != -1) return dp[i][j];

                int firstLetter = sChar[i];
                int answer = 1 + this.apply(i + 1, j);

                for (int k = i + 1; k <= j; k++) {
                    if (sChar[k] == firstLetter) {
                        int betterAnswer = this.apply(i, k - 1) + this.apply(k + 1, j);
                        answer = Math.min(answer, betterAnswer);
                    }
                }
                return dp[i][j] = answer;
            }
        };

        return Util.apply(0, n - 1);
    }

    public static void main(String[] args) {
        StrangePrinterSolution solution = new StrangePrinterSolution();
        String s = "aaabbb";
        int result = solution.strangePrinter(s);
        System.out.println("Minimum number of turns the printer needed: " + result);
    }
}
