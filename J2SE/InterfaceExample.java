//interface example
interface Animal {
	void sound();
	void sleep();
}
class Dog implements Animal{
	public void sound(){
		System.out.println("dog barks");
	}
	public void sleep(){
		System.out.println("Dog Sleeps");
	}
}
public class InterfaceExample {
	public static void main(String args[]){
		Dog dog=new Dog();
		dog.sound();
		dog.sleep();
	}
}