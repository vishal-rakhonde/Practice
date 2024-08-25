import java.util.Scanner;
class EvenOdd {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int n= sc.nextInt();
		if(n>0 && n%2==0)
			System.out.println(n+" is even number");
		else if(n<0 )
			System.out.println(n+" is negative number");
		else if(n==0)
			System.out.println(n+" is zero");
		else
			System.out.println(n+" is odd number");
	}
}