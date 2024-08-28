//5.Find a duplicate element in a limited range array
class DuplicateElement{
	public static void duplicateFinder(int[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					System.out.print(" "+arr[i]);
				}
			}
		}
	}
	
	public static void main(String[] args){
		int[] arr={10,50,60,70,15,10,70};
		duplicateFinder(arr);
		
		
	}
}