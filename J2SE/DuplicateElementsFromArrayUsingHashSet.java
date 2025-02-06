import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

class DuplicateElementsFromArrayUsingHashSet {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements in array : ");
		int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
		int[] arr={10,60,55,88,55,66,77,40,10};
		Set<Integer> s = new HashSet <>();
		System.out.println("Duplicate Elements from array are : ");
		for(int no : arr){
			if(s.add(no)==false){
				System.out.print(no+" ");
			}
		}
	}
}