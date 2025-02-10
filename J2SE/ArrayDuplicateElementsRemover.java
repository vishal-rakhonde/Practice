import java.util.HashSet;
class ArrayDuplicateElementsRemover {
	public static void duplicateElementsRemover(int arr[]){
		HashSet <Integer> set=new HashSet <>();
		for(int i=0;i<arr.length;i++){
			
			set.add(arr[i]);
		}
		System.out.println(set);
	}

	
	public static void main(String[] args){
		int arr[]={10,30,44,77,10,22,44};
		duplicateElementsRemover(arr);
	}
}	