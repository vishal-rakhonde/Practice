class Solution {
    public String shortestPalindrome(String s) {
        if (s == null || s.length() <= 1) return s;

        String reverseS = new StringBuilder(s).reverse().toString();
        int count = kmp(s, reverseS);
        return reverseS.substring(0, s.length() - count) + s;
    }

    private int kmp(String patt, String txt) {
        String newString = patt + '#' + txt;
        int n = newString.length();
        int[] pi = new int[n];
        
        int k = 0;
        for (int i = 1; i < n; i++) {
            while (k > 0 && newString.charAt(i) != newString.charAt(k)) {
                k = pi[k - 1];
            }
            if (newString.charAt(i) == newString.charAt(k)) {
                k++;
            }
            pi[i] = k;
        }
        
        return pi[n - 1];
    }
}
