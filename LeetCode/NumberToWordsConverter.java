/* Integer to English Words

Convert a non-negative integer num to its English words representation.

Example 1:

Input: num = 123
Output: "One Hundred Twenty Three"
Example 2:

Input: num = 12345
Output: "Twelve Thousand Three Hundred Forty Five"
Example 3:

Input: num = 1234567
Output: "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"
 

Constraints:

0 <= num <= 231 - 1
*/

import java.util.Scanner;

public class NumberToWordsConverter {

    private static final String[] LESS_THAN_20 = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
    private static final String[] TENS = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
    private static final String[] THOUSANDS = { "", "Thousand", "Million", "Billion" };

    public String numberToWords(int num) {
        if (num == 0) return "Zero";
        StringBuilder words = new StringBuilder();
        int index = 0;
        while (num > 0) {
            if (num % 1000 != 0) {
                words.insert(0, helper(num % 1000).trim() + " " + THOUSANDS[index] + " ");
            }
            num /= 1000;
            index++;
        }
        return words.toString().trim();
    }

    private String helper(int num) {
        if (num == 0) return "";
        if (num < 20) return LESS_THAN_20[num] + " ";
        if (num < 100) return TENS[num / 10] + " " + helper(num % 10);
        return LESS_THAN_20[num / 100] + " Hundred " + helper(num % 100);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        NumberToWordsConverter converter = new NumberToWordsConverter();
        String words = converter.numberToWords(num);
        System.out.println(words);
        scanner.close();
    }
}
