import java.util.HashSet;
import java.util.Set;

public class CompaireTwoStrings {
	public static void main(String[] args) {
		String s1="abcde";
		String s2="dcbaef";
		Set<Character>set2=new HashSet<>();
		Set<Character>set=new HashSet<>();
		for(int i=0;i<s1.length();i++) {
//			set2.add(s1.charAt(i));
			for(int j=0;j<s2.length();j++) {
				if(s1.charAt(i)==s2.charAt(j)) {
					set.add(s1.charAt(i));
					set.add(s2.charAt(j));
				}
				else {
					set2.add(s1.charAt(i));
					set2.add(s2.charAt(j));
				}
			}
		}
		
		System.out.println(set);
		System.out.println(set2.removeAll(set));
		System.out.println(set2);
		
	}
}
