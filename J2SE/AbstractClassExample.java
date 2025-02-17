abstract class Animal {
	public abstract void makeSound();
	public void eat(){
		System.out.println("This Animal is Eating");
	}
}
class Dog extends Animals {
	@Override
	public void makeSound(){
		System.out.println("bark");
	}
}
public class AbstractClassExample {
	public static void main(String[] args){
		Dog d= new Dog();
		d.makeSound();
		d.eat();
	}
}
