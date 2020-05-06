public class RubberDuck extends Duck {
	public RubberDuck() {
		this.type = "rubber (Резиновый)";
		this.flyBehavior = new FlyNoWay();
		this.quackBehavior = new Squeak();
	}
}
