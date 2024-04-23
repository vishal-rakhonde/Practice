
public class FindMissingElement1 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,6};
		int actual_ele=a.length+1;
		int total_sum=((actual_ele)*(actual_ele+1))/2;
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}System.out.print(total_sum - sum);
	}

}
