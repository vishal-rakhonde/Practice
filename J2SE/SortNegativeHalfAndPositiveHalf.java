
public class SortNegativeHalfAndPositiveHalf {
	public static void main(String[] args) {
		int []arr= {1,2,-2,-3,4,-5};
		int []str=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				str[i]+=arr[i];
				System.out.print(str[i]+" ");
			}
		}
		for(int j=0;j<arr.length;j++) {
			if(arr[j]>0) {
				str[j]+=arr[j];
				System.out.print(str[j]+" ");
			}
		}
		
	}
}
