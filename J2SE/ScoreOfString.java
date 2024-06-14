/*You are given a string s. The score of a string is defined as the sum of the absolute difference between the ASCII values of adjacent characters.*/
//-------------------------------------------------------------------------------------


import java.util.Scanner;

public class ScoreOfString {
    public int scoreOfString(String s) {
        int score = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            score += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        return score;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        ScoreOfString solution = new ScoreOfString();
        int score = solution.scoreOfString(s);

        System.out.println("Score of the string \"" + s + "\": " + score);
    }
}

