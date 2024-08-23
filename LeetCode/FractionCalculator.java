/* Fraction Addition and Subtraction

Given a string expression representing an expression of fraction addition and subtraction, return the calculation result in string format.

The final result should be an irreducible fraction. If your final result is an integer, change it to the format of a fraction that has a denominator 1. So in this case, 2 should be converted to 2/1.

 

Example 1:

Input: expression = "-1/2+1/2"

Output: "0/1"
Example 2:

Input: expression = "-1/2+1/2+1/3"

Output: "1/3"
Example 3:

Input: expression = "1/3-1/2"
Output: "-1/6"
 

Constraints:

The input string only contains '0' to '9', '/', '+' and '-'. So does the output.
Each fraction (input and output) has the format ±numerator/denominator. If the first input fraction or the output is positive, then '+' will be omitted.
The input only contains valid irreducible fractions, where the numerator and denominator of each fraction will always be in the range [1, 10]. If the denominator is 1, it means this fraction is actually an integer in a fraction format defined above.
The number of given fractions will be in the range [1, 10].
The numerator and denominator of the final result are guaranteed to be valid and in the range of 32-bit int.
*/

class FractionCalculator {
    public String fractionAddition(String expression) {
        int numerator = 0, denominator = 1;
        int index = 0, n = expression.length();

        while (index < n) {
            // Read numerator
            int numStart = index;
            while (index < n && expression.charAt(index) != '/') {
                index++;
            }
            int num = Integer.parseInt(expression.substring(numStart, index));

            // Skip '/'
            index++;

            // Read denominator
            int denStart = index;
            while (index < n && Character.isDigit(expression.charAt(index))) {
                index++;
            }
            int den = Integer.parseInt(expression.substring(denStart, index));

            // Update the numerator and denominator
            numerator = numerator * den + num * denominator;
            denominator *= den;

            // Simplify the fraction
            int gcdVal = gcd(Math.abs(numerator), denominator);
            numerator /= gcdVal;
            denominator /= gcdVal;
        }

        return numerator + "/" + denominator;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        FractionCalculator calculator = new FractionCalculator();
        
        // Test cases
        String expression1 = "-1/2+1/2";
        String expression2 = "-1/2+1/2+1/3";
        String expression3 = "1/3-1/2";

        // Results
        System.out.println("Result of \"" + expression1 + "\": " + calculator.fractionAddition(expression1)); // "0/1"
        System.out.println("Result of \"" + expression2 + "\": " + calculator.fractionAddition(expression2)); // "1/3"
        System.out.println("Result of \"" + expression3 + "\": " + calculator.fractionAddition(expression3)); // "-1/6"
    }
}
