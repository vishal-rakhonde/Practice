//How do you convert a Roman numeral String to Integer in Java?

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = romanValues.get(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            int currentValue = romanValues.get(s.charAt(i));
            int previousValue = romanValues.get(s.charAt(i - 1));

            if (currentValue > previousValue) {
                result += currentValue - 2 * previousValue;
            } else {
                result += currentValue;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String romanNumeral = "MMXXIV"; // 2024
        int intValue = romanToInt(romanNumeral);
        System.out.println("Integer value of Roman numeral " + romanNumeral + ": " + intValue);
    }
}

