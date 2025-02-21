import java.util.Scanner;

class ArmstrongNumber {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num=sc.nextInt();
		int res;
		int temp= num;
		int sum=0;
		while(num > 0){
			res= num%10;
			num= num/10;
			sum= sum+(res * res * res);
		}
		if(sum == temp){
			System.out.println("Number is armstrong");
		}
		else
			System.out.println("Number is not armstrong");
	}
}