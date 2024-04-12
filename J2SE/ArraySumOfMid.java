public class ArraySumOfMid {
	public static void main(String[] args) {
		int sum = 0,sum1=0;
		int a[]= {1,2,3,5,8,6,5};
		for(int i=a.length-1;i>=0;i--) {
			sum+=a[i];
			for(int j=0;j<a.length;j++) {
				sum1+=a[j];
			}
			if(sum==sum1) {
				System.out.println(a[i-1]);
			}
		}
	}

}
