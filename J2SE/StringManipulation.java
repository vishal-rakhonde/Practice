/* Given a string with a mix of small and capital letters, write a program to change all
small letters to capital and all capital letters to small. */

class StringManipulation {
	public static void main(String[] args){
		String str="AbCDef";
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
	}
}					