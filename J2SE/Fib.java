public class Fib {

public static void fibs (long a , long b , long c){
	if (c == 100){
	return ;
	}
	System.out.print(a+b+" ");
	fibs(b,a+b,c+1);
	}

	public static void main (String [] args){
	long a = 0,b= 1;
	fibs(a,b,0);

	}
	}

