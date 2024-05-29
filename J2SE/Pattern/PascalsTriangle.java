//The Java code for printing Pascal’s triangle pattern .

public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 6;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++)
                System.out.print(" ");

            int value = 1;

            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value = value * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}