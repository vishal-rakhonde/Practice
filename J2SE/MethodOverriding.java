class Animal {
	public void sound(){
		System.out.println("Animal sound");
	}
}
class Dog extends Animal {
	@Override
	public void sound(){
		System.out.println("Dog barks.");
	}
}
public class MethodOverriding {
	public static void main(String[] args){
		Animal an=new Animal();
		Dog d=new Dog();
		an.sound();
		d.sound();
	}
}