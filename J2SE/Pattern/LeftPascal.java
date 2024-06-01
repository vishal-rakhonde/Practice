//The Java code for printing a left Pascal's triangle 
 
public class LeftPascal {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {

            for(int j=2*(n-i-1);j>=0;j--) System.out.print(" ");
            
            for (int j = 0; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }

        for (int i = n - 1; i > 0; i--) {
            
            for(int j=2*(n-i);j>=0;j--) System.out.print(" ");

            for (int j = i; j > 0; j--)
                System.out.print("* ");
            System.out.println();
        }
    }
}
