import java.util.Scanner;
class Factorial {
	public static int factorialFinder(int num){
		int n=num;
		int fact=1;
		if(num ==0)
			return fact;
		for(int i=n;i>=1;i--){
			fact *=i;
		}
		return fact;
	}
			
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int result=factorialFinder(num);
		System.out.println("factorial of "+num+" is "+result);
	}
}
		
	