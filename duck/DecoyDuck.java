public class DecoyDuck extends Duck {
	public DecoyDuck() {
		this.type = "decoy (Деревянный)";
		this.flyBehavior = new FlyNoWay();
		this.quackBehavior = new Mute();
	}
}