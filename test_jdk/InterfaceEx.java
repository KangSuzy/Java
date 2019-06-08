package test;

interface Animal{
	void sound();
}

class Dog implements Animal{
	@Override
	public void sound() {
		System.out.println("Woof Woof!");
	}
}


class Cat implements Animal{
	@Override
	public void sound() {
		System.out.println("Meow Meow!");
	}
}

public class InterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] animal  = new Animal[2];
		animal[0] = new Dog();
		animal[1] = new Cat();
		
		for(Animal a : animal)
			a.sound();
	}

}
