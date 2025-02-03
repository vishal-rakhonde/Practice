import java.util.Scanner;
class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        
        if(str == null || str.length() == 0) {
            System.out.println("String is empty");
        } else {
            reverseString(str);
        }
        sc.close();
    }


    public static void reverseString(String str) {
        for(int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));
    }
  }
}
