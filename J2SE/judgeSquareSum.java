/* Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.

 

Example 1:

Input: c = 5
Output: true
Explanation: 1 * 1 + 2 * 2 = 5
Example 2:

Input: c = 3
Output: false
*/

class Solution {
    public boolean judgeSquareSum(int c) {
        long s = 0, e = (long) Math.sqrt(c), sum;
        while(s <= e){
            sum = (s*s) + (e*e);
            if(sum < c) s++;
            else if(sum > c) e--;
            else return true;
        }
        return c == 1;
    }
}
