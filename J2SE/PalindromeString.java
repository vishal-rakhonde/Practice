import java.util.Scanner;
class PalindromeString {
	
	public boolean palindromeChecker(String str){
		int left=0;
		int right=str.length()-1;
		while(left < right){
			if(str.charAt(left) != str.charAt(right)){
				return false;
			
			}
			left++;
			right--;
		}
		return true;	
	}
	
	public static void main(String[] args){
		PalindromeString ps = new PalindromeString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		if(ps.palindromeChecker(str)){
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
	}
}
		