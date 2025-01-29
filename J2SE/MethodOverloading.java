class Calculator {
	public int add(int a, int b){
		return a+b;
	}
	public double add(double a, double b){
		return a+b;
	}
	
}
public class MethodOverloading{
	public static void main(String[] args){
		Calculator c = new Calculator();
		System.out.println(c.add(5,2));
		System.out.println(c.add(5.0,6.2));
	}
}