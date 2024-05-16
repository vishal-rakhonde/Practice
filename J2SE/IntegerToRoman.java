import java.util.Scanner;
import java.util.TreeMap;

public class IntegerToRoman {
    public static String intToRoman(int num) {
        if (num <= 0 || num > 3999) {
            return "Invalid number";
        }
        
        //to store the mappings of integers to Roman numerals
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
        
        StringBuilder roman = new StringBuilder();
        for (int key : map.descendingKeySet()) {
            while (num >= key) {
                roman.append(map.get(key));
                num -= key;
            }
        }
        
        return roman.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        
        String romanNumeral = intToRoman(number);
        System.out.println("Roman numeral for " + number + " is: " + romanNumeral);
        
        sc.close();
    }
}
