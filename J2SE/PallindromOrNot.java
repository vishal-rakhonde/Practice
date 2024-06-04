package String;

public class PallindromOrNot {

	public static void main(String[] args) {
		
		String name="Omkar";
		String rev="";
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		if(name.equals(rev)) {
			System.out.println("Omkar is Pallindrom");
		}else {
			System.out.println("Omkar is Not Pallindrom");
		}

	
}
}