import java.util.Scanner;
class FindDigitFromString{
	public static void findDigits(String str){
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>='0' && str.charAt(i)<='9'){
				System.out.print(str.charAt(i)+" ");
			}
		}
	}
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string : ");
	String str=sc.nextLine();
	findDigits(str);
	sc.close();
	}
}
