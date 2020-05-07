public class DecoyDuck extends Duck {
	public DecoyDuck() {
		type = "decoy (Деревянный)";
		flyBehavior = new FlyNoWay();
		quackBehavior = new Mute();
	}
}