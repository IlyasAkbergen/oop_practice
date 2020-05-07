class main {
	public static void main(String[] args) {
		Duck mDuck = new MallardDuck();
		Duck rDuck = new RubberDuck();
		Duck dDuck = new DecoyDuck();

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
