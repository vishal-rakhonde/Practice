/*How Convert lower to upper case without using toUppercase() in java? 
*/
import java.util.Scanner;
class LowercaseToUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character");
        String s = sc.nextLine();
        char[] ch = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                ch[i] = (char) (c - 32);
            } else {
                ch[i] = c;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            System.out.print(ch[i] + " ");
        }
    }
}

			
		