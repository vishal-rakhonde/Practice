/* Ugly Number II

An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.

Given an integer n, return the nth ugly number.

 

Example 1:
Input: n = 10

Output: 12

Explanation: [1, 2, 3, 4, 5, 6, 8, 9, 10, 12] is the sequence of the first 10 ugly numbers.
Example 2:

Input: n = 1

Output: 1
Explanation: 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5.
 

Constraints:

1 <= n <= 1690
*/
public class UglyNumberFinder {

    public int nthUglyNumber(int n) {
        int[] num = new int[n];
        num[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0;
        int nextMultipleOf2 = 2;
        int nextMultipleOf3 = 3;
        int nextMultipleOf5 = 5;
        
        for (int i = 1; i < n; i++) {
            int nextUgly = Math.min(nextMultipleOf2, Math.min(nextMultipleOf3, nextMultipleOf5));
            num[i] = nextUgly;
            
            if (nextUgly == nextMultipleOf2) {
                i2++;
                nextMultipleOf2 = num[i2] * 2;
            }
            if (nextUgly == nextMultipleOf3) {
                i3++;
                nextMultipleOf3 = num[i3] * 3;
            }
            if (nextUgly == nextMultipleOf5) {
                i5++;
                nextMultipleOf5 = num[i5] * 5;
            }
        }
        
        return num[n - 1];
    }

    public static void main(String[] args) {
        UglyNumberFinder finder = new UglyNumberFinder();
        int n = 10;  
        int nthUglyNumber = finder.nthUglyNumber(n);
        System.out.println("The " + n + "th ugly number is: " + nthUglyNumber);
    }
}
