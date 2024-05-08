import java.util.Scanner;
public class DownTriangle {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		for (int i = r - 1; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
	}
}