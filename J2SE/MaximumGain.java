/* Maximum Score From Removing Substrings

You are given a string s and two integers x and y. You can perform two types of operations any number of times.

Remove substring "ab" and gain x points.
For example, when removing "ab" from "cabxbae" it becomes "cxbae".
Remove substring "ba" and gain y points.
For example, when removing "ba" from "cabxbae" it becomes "cabxe".
Return the maximum points you can gain after applying the above operations on s.

Example 1:
Input: s = "cdbcbbaaabab", x = 4, y = 5
Output: 19
Explanation:
- Remove the "ba" underlined in "cdbcbbaaabab". Now, s = "cdbcbbaaab" and 5 points are added to the score.
- Remove the "ab" underlined in "cdbcbbaaab". Now, s = "cdbcbbaa" and 4 points are added to the score.
- Remove the "ba" underlined in "cdbcbbaa". Now, s = "cdbcba" and 5 points are added to the score.
- Remove the "ba" underlined in "cdbcba". Now, s = "cdbc" and 5 points are added to the score.
Total score = 5 + 4 + 5 + 5 = 19.
Example 2:

Input: s = "aabbaaxybbaabb", x = 5, y = 4
Output: 20
 

Constraints:
1 <= s.length <= 105
1 <= x, y <= 104
s consists of lowercase English letters.
*/
public class Main {
    static class Solution {
        public int maximumGain(String s, int x, int y) {
            int aCount = 0;
            int bCount = 0;
            int lesser = Math.min(x, y);
            int result = 0;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c > 'b') {
                    result += Math.min(aCount, bCount) * lesser;
                    aCount = 0;
                    bCount = 0;
                } else if (c == 'a') {
                    if (x < y && bCount > 0) {
                        bCount--;
                        result += y;
                    } else {
                        aCount++;
                    }
                } else { // c == 'b'
                    if (x > y && aCount > 0) {
                        aCount--;
                        result += x;
                    } else {
                        bCount++;
                    }
                }
            }

            result += Math.min(aCount, bCount) * lesser;

            return result;
        }
    }

    // Main method to test the maximumGain function
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        String s1 = "aabbaaxyb";
        int x1 = 1;
        int y1 = 2;
        int result1 = solution.maximumGain(s1, x1, y1);
        System.out.println("Result 1: " + result1); // Expected output: 7

        String s2 = "aabbaaxyb";
        int x2 = 2;
        int y2 = 1;
        int result2 = solution.maximumGain(s2, x2, y2);
        System.out.println("Result 2: " + result2); // Expected output: 8

        // Add more test cases as needed
    }
}
