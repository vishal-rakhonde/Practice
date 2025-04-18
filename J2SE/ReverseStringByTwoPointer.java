import java.util.Scanner;
class ReverseStringByTwoPointer{
	public String reverseString(String str){
		char[] charArray=str.toCharArray();
		int left=0, right=charArray.length-1;
		while(left< right){
			char temp=charArray[left];
			charArray[left]=charArray[right];
			charArray[right]=temp;
			left++;
			right--;
		}
		return new String(charArray);
	}
			

	public static void main(String[] args){
		ReverseStringByTwoPointer rs=new ReverseStringByTwoPointer();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		String s=rs.reverseString(str);
		System.out.println(s);
	}
}