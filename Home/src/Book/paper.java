package Book;

class Animal {
	protected String name;

	public Animal(String name) {
		this.name = name;
	}

	public void eat() {
		System.out.println(name + " is eating.");
	}
}

class Cat extends Animal {
	private int age;

	public Cat(String name, int age) {
		super(name);
		this.age = age;
	}

	public void meow() {
		System.out.println(name + " says meow.");
	}
}

public class paper {
	public static void main(String[] args) {
		Cat cat = new Cat("Tom", 3);
		cat.eat();
		cat.meow();
	}
}
