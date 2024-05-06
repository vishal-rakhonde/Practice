import java.util.Scanner;
public class ReversedPyramidStarPattern{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows of Pyramid");
		int num = sc.nextInt(); 
		int i = num, j;
		while (i > 0) {
			j = 0;
			while (j++ < num - i) {
				System.out.print(" ");
			}
			j = 0;
			while (j++ < (i * 2) - 1) {
				System.out.print("*");
			}
			System.out.println();
			i--;
		}
	}
}