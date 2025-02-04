/* Given a string with a mix of small and capital letters, write a program to change all
small letters to capital and all capital letters to small. */
import java.util.Scanner;
class StringManipulation {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.nextLine();
		StringBuilder modified=new StringBuilder();
		
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(Character.isLowerCase(ch)){
				modified.append(Character.toUpperCase(ch));
			}
			else if(Character.isUpperCase(ch)){
				modified.append(Character.toLowerCase(ch));
			}
		}
		System.out.println("Modified String is : "+modified );
		sc.close();
	}
}					