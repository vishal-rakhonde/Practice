import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the haystack: ");
        String haystack = sc.nextLine();
        
        System.out.print("Enter the needle: ");
        String needle = sc.nextLine();

        SubstringSearch solution = new SubstringSearch();
        int result = solution.strStr(haystack, needle);
        System.out.println("The index of the first occurrence of needle in haystack is: " + result);
        
        sc.close();
    }
}
