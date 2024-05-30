
public class StringRemoveChar {
	public static void main(String[] args) {
		String str = "welcome";
		char c = 'e';
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != c) {
				System.out.print(str.charAt(i));
			}
		}
		
	}

}
