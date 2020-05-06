public class MallardDuck extends Duck {
	public MallardDuck() {
		this.type = "mallard";
		this.flyBehavior = new FlyWithWings();
		this.quackBehavior = new Quack();
	}
}