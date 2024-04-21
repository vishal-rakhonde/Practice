// Write a Java program to find second largest element in an array of integers?

public class SecondLargest {

	public static void main(String[] args) {
		int arr[]= {10,15,99,72,0,4,1};
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					 temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		
		}
//		System.out.print(arr[i]);
		int len=arr.length-2;
		System.out.print(arr[len]);
	}

}