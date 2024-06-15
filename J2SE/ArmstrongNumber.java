public class ArmstrongNumber {

	public static void main(String[] args) {
		// we find firstly length on the using while loop
		int no=153;
		int t1=no;			//t1 is using because of the original no is not to be changed
		int leng=0;			//leng is using because of the to finding the length
		while(t1!=0) {
			leng=leng+1;
			t1=t1/10;
		}
		//we are finding the armstrong number 
		int t2=no; 			//t2 is using because of the original no is not to be changed
		int arm=0;
		int rem;
		while(t2!=0) {
			int mul=1;
		rem=t2%10;
		for(int i=1;i<=leng;i++) {
			mul=mul*rem;
		}
		arm=arm+mul;
		t2=t2/10;
		}
		if(no==arm) {
			System.out.println(no+" is a Armstrong Number");
		}else {
			System.out.println(no+" is not a Armstrong Number");
		}

	}

}
