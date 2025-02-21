class  ArmstrongNumber {
	public static void main(String[] args){
		int num=253;
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