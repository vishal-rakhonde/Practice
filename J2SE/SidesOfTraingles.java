public class SidesOfTraingles {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<(i*2);k++) {
				if(k>1 && k<(i*2)-1) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}	System.out.println();
		}	System.out.println("--------------------------------");
		for(int a=5;a>=1;a--) {
			for(int b=5;b>=a;b--) {
				System.out.print(" ");
			}
			for(int c=1;c<(a*2);c++) {
				if(c>1 && c<(a*2)-1) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}	System.out.println();
		}
	}

}
