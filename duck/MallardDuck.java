public class MallardDuck extends Duck {
	public MallardDuck() {
		type = "mallard";
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
}