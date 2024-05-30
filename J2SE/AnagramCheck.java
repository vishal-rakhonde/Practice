//How to check if two given String is the anagram of each other?

import java.util.Arrays;

public class AnagramCheck {
    public static boolean areAnagrams(String str1, String str2) {
        // Step 1: Check if lengths are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Step 2: Sort characters in both strings
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Step 3: Compare sorted strings
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String str1 = "Vishal";
        String str2 = "String";
        
        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
