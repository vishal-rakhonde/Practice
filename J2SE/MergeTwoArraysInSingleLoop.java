// merge two arrays in new array in single loop

class MergeTwoArraysInSingleLoop{
	public static void mergeArray(int[] arr1,int[] arr2){
		int index=0;
		int[] arr3=new int[arr1.length+arr2.length];
		int i=0,j=0;
		
		while(i<arr1.length || j<arr2.length){
			if(i<arr1.length){
			arr3[index]=arr1[i];
			System.out.print(arr3[index++]+" ");
			i++;
			}
			if(j<arr2.length){
				arr3[index]=arr2[j];
				System.out.print(arr3[index++]+" ");
				j++;
			}
	
		}
	}
	
	public static void main(String[] args){
		int[] arr1={10,30,50,20,44};
		int[] arr2={33,25,11,66,24};
		mergeArray(arr1,arr2);
	}
}
		