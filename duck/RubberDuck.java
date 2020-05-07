public class RubberDuck extends Duck {
	public RubberDuck() {
		type = "rubber (Резиновый)";
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
}
