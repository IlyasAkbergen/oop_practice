public abstract class Duck {
	FlyBehavior flyBehavior;  
	QuackBehavior quackBehavior;
	String type = "basic type";

	public void swim () {
		System.out.println("Is swimming.");
	}

	public void performQuack() {
		quackBehavior.makeSound();
	}

	public void performFly() {
		flyBehavior.fly();
	}

	public void display () {
		System.out.println("Duck of type: " + this.type);
	}
}