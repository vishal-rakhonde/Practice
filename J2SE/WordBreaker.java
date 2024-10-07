public class WordBreaker{
	public static void main(String args[]){
		String str = "Vishal Cdac Mumbai";
		
		char ch[] = str.toCharArray();
		
		for (int i=0;i<ch.length;i++){
			if(ch[i] == ' '){
				System.out.println();
			}
			else{
				System.out.print(ch[i]);
			}
		}
	}
}