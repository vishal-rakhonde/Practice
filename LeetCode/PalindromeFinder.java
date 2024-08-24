/* Find the Closest Palindrome

Given a string n representing an integer, return the closest integer (not including itself), which is a palindrome. If there is a tie, return the smaller one.

The closest is defined as the absolute difference minimized between two integers.

Example 1:
Input: n = "123"

Output: "121"

Example 2:

Input: n = "1"

Output: "0"
Explanation: 0 and 2 are the closest palindromes but we return the smallest which is 0.

Constraints:

1 <= n.length <= 18
n consists of only digits.
n does not have leading zeros.
n is representing an integer in the range [1, 1018 - 1].
*/
import java.util.HashSet;
import java.util.Set;

public class PalindromeFinder {
    public String nearestPalindromic(String n) {
        int length = n.length();
        if (length == 1) {
            return String.valueOf(Integer.parseInt(n) - 1);
        }

        Set<Long> candidates = new HashSet<>();
        candidates.add((long) Math.pow(10, length - 1) - 1);
        candidates.add((long) Math.pow(10, length) + 1);

        long prefix = Long.parseLong(n.substring(0, (length + 1) / 2));
        
        for (int i = -1; i <= 1; i++) {
            String candidatePrefix = String.valueOf(prefix + i);
            String candidate;
            if (length % 2 == 0) {
                candidate = candidatePrefix + new StringBuilder(candidatePrefix).reverse().toString();
            } else {
                candidate = candidatePrefix + new StringBuilder(candidatePrefix.substring(0, candidatePrefix.length() - 1)).reverse().toString();
            }
            candidates.add(Long.parseLong(candidate));
        }

        candidates.remove(Long.parseLong(n));

        long originalNumber = Long.parseLong(n);
        long closest = -1;
        for (long candidate : candidates) {
            if (closest == -1 || Math.abs(candidate - originalNumber) < Math.abs(closest - originalNumber) || 
                (Math.abs(candidate - originalNumber) == Math.abs(closest - originalNumber) && candidate < closest)) {
                closest = candidate;
            }
        }

        return String.valueOf(closest);
    }

    public static void main(String[] args) {
        PalindromeFinder finder = new PalindromeFinder();

        String n1 = "123";
        String n2 = "1";

        System.out.println("Closest palindrome to " + n1 + " is: " + finder.nearestPalindromic(n1)); // Output: "121"
        System.out.println("Closest palindrome to " + n2 + " is: " + finder.nearestPalindromic(n2)); // Output: "0"
    }
}
