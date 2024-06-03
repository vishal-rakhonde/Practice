
//The Java code for printing a down triangle pattern is given below:


public class DownTringle {
    public static void main(String[] args) {
        int n = 5;

        while (n > 0) {
            for (int i = 0; i < n; i++)
                System.out.print("* ");

            n--;
            System.out.println();
        }

    }
}
