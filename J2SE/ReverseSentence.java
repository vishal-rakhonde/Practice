import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        String[] words = input.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + (i > 0 ? " " : ""));
        }

        sc.close();
    }
}
