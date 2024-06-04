//How to convert Integer to Roman String?

public class IntegerToRoman {
    public static String intToRoman(int num) {
        // Define arrays for Roman numeral symbols and their corresponding values
        String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        
        StringBuilder result = new StringBuilder();
        
        // Iterate through the values
        for (int i = 0; i < values.length; i++) {
            // Repeat the current symbol while num is greater than or equal to its value
            while (num >= values[i]) {
                result.append(romanSymbols[i]);
                num -= values[i];
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        int number = 2024;
        String romanNumeral = intToRoman(number);
        System.out.println("Roman numeral representation of " + number + ": " + romanNumeral);
    }
}
