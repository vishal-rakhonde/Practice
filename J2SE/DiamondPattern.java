public class DiamondPattern {
    public static void main(String[] args) {
        int n = 7; // add odd size
        int mid = n / 2;
        for (int i = 0; i < n; i++) {
            int stars = 2 * (mid - Math.abs(mid - i)) + 1; 
            int spaces = (n - stars) / 2; 

            printChars(' ', spaces);
            printChars('*', stars);
            System.out.println();
        }
    }
    
    private static void printChars(char ch, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(ch);
        }
    }
}
