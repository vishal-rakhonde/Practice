import java.util.Set;
import java.util.HashSet;

class DuplicateElementsFromArrayUsingHashSet {
	public static void main(String[] args){
		int[] arr={10,60,55,88,55,66,77,40,10};
		Set<Integer> s = new HashSet <>();
		System.out.println("Duplicate Elements from array are : ");
		for(int no : arr){
			if(s.add(no)==false){
				System.out.print(no+" ");
			}
		}
}}