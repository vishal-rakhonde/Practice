/*class RemoveDuplicates{
	public static void  removeDuplicates(String str){
		String str1=str;
		int i=0;
		for(int i=0;i<=str.length();i++){
			for(int j=0;j<=str1.length;j++){
				if(i != j && str.charAt(i) == str1.charAt(j)){
					
				}
				if(i != j && str.charAt(i) != str1.charAt(j)){
					System.out.println
					
					
					
		}
			
			
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		
	}*/
import java.util.*;

class RemoveDuplicates {
    public static void removeDuplicates(String str) {
        
        Set<Character> set = new LinkedHashSet<>();
        
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        
        StringBuilder result = new StringBuilder();
        for (Character ch : set) {
            result.append(ch);
        }
        
        System.out.println("String after removing duplicates: " + result.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        removeDuplicates(str);
    }
}
