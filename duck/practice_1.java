class main {
	public static void main(String[] args) {
		MallardDuck mDuck = new MallardDuck();
		RubberDuck rDuck = new RubberDuck();
		DecoyDuck dDuck = new DecoyDuck();

		mDuck.display();
		mDuck.swim();
		mDuck.performQuack();
		mDuck.performFly();

		rDuck.display();
		rDuck.swim();
		rDuck.performQuack();
		rDuck.performFly();

		dDuck.display();
		dDuck.swim();
		dDuck.performQuack();
		dDuck.performFly();
	}
}
