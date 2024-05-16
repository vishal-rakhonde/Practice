public class Stack {
	static final int MAX=5;
	int top;
	int a[]=new int[MAX];
	boolean isEmpty(){
		return( top < 0 );
	}
	boolean isNull(){
		return (top>n);
	}
	Stack(){
		top = -1;
	}
	boolean push(int x){
		if( top >= ( MAX-1 )){
			System.out.println("stack overflow");
			return false;
		}
		else{
			s[++top] = x ;
			System.out.println("push "+x);
			return true;
		}
	}
	int pop(){
		if( top < 0 ){
			System.out.println("Stack underflow");
			return 0;
	}
	else {
		a[--top]= a[top--1];
		return x;
	}
}
	int peek(){
		if( top < 0){
			System.out.println("Empty");
			return 0;
		}
		else {
				int x = a[top];
				return x;
			}
		}
		public static void main(String[] args){
			Stack st=new Stack();
			st.push(10);
			st.push(20);
			st.push(30);
			st.push(40);
			System.out.println(st.pop()+"pop from stack");
		}
	}
			
			
			