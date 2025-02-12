import java.util.Scanner;
class CountCharacter {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		if(str == null || str.length()==0){
			System.out.println("String is empty");
		}
		else{
			countCharacters(str);
		}
		sc.close();
	}
		
		public static void countCharacters(String str){
			boolean[] isCounted = new boolean[256];
			for(int i=0;i<str.length();i++){
				char currentChar = str.charAt(i);
				
				if(isCounted[currentChar]){
					continue ;
				}
				int count=0;
				for(int j=0;j<str.length();j++){
					if(str.charAt(j)==currentChar){
						count++;
					}
				}
				isCounted[currentChar] = true;
				System.out.println("Character "+currentChar+" - "+count);
			}
		}
}		