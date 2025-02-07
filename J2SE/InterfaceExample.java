interface Animal {
	void makeSound();
	void eat();
}
class Dog implements Animal {
	@Override
	public void makeSound () {
		System.out.println("Barks");
	}
	
	@Override
	public void eat () {
		System.out.println("Dog is eating");
	}
}
public class InterfaceExample {
	public static void main(String[] args){
		Dog d = new Dog();
		d.makeSound();
		d.eat();
	}
}