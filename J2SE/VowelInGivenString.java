
public class VowelInGivenString {
	public static void main(String[] args) {
		String name="welcome to spring boot project";
		int count=0;
		String s="";
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='a' ||name.charAt(i)=='e' ||name.charAt(i)=='i' ||name.charAt(i)=='o' ||name.charAt(i)=='u') {
				count+=1;
				s+=name.charAt(i);
			}
		}
		System.out.println(s);
		System.out.println(count);
	}
}
