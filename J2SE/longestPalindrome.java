/* Given a string s which consists of lowercase or uppercase letters, return the length of the longest 
palindrome
 that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome.*/
class Solution {
    public int longestPalindrome(String s) {
        int[] charCount = new int[128]; // ASCII characters

        for (char c : s.toCharArray()) {
            charCount[c]++;
        }
        
        int length = 0;
        boolean oddCountFound = false;
        
        for (int count : charCount) {
            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1;
                oddCountFound = true;
            }
        }
        
        if (oddCountFound) {
            length += 1;
        }
        
        return length;
    }
}
