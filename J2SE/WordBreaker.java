import java.util.Scanner;

public class WordBreaker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = sc.nextLine();
        char ch[] = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ') {
                System.out.println();
            } else {
                System.out.print(ch[i]);
            }
        }
        sc.close();
    }
}
