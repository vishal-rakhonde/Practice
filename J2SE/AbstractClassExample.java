abstract class AbstractClassExample {
	abstract void print();
	public void display(){
		System.out.println("In display method");
	}
}
class Demo extends AbstractClassExample {
	@Override 
	void print(){
		System.out.println("In print method");
	}
	public static void main(String[] args){
		Demo d=new Demo();
		d.print();
		d.display();
	}
}