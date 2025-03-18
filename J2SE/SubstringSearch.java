public class SubstringSearch {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.startsWith(needle, i)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        SubstringSearch solution = new SubstringSearch();
        System.out.println(solution.strStr("sadbutsad", "sad")); 
        System.out.println(solution.strStr("leetcode", "leeto"));
    }
}