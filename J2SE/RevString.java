//reverse string
public class RevString {
	public static void main(String[] args) {
		String a="I am Java Developer";
		
		// full string is reverse
		for(int i=a.length()-1;i>=0;i--) {
			System.out.print(a.charAt(i));
		}
		
		
		
		System.out.println();
		
		//String is reverse as per each elements
		
		String[] s=a.split(" ");
		String b="";
		for(int i=0;i<s.length;i++) {
			String rev=s[i];
			for(int j=rev.length()-1;j>=0;j--) {
				b+=rev.charAt(j);
			}
			b+=" ";
		}
		System.out.println(b);
	}
}
