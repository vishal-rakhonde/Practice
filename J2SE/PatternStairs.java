

public class PatternStairs {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}for(int k=1;k<=i;k++) {
				System.out.print("*");
			}System.out.println();
		}
//		System.out.println("------------------------------------------");
		for(int a=1;a<=4;a++) {
			for(int b=1;b<=a;b++) {
				System.out.print(" ");
			}for(int c=4;c>=a;c--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
