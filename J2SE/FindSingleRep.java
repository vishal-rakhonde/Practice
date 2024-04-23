public class FindSingleRep {

	public static void main(String[] args) {
		int []a= {2,3,4,5,3,5,4,2,7};
		int res=a[0];
		for(int i=1;i<a.length;i++) {
			res=res^a[i];
		}System.out.println("Single repeated element is: "+res);

	}

}
