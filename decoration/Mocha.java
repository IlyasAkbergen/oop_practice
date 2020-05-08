public class Mocha extends CondimentDecorator {
	static double COST = .20;
	Beverage beverage;

	public Mocha(Beverage b){
		beverage = b;
	}

	public String getDescription () {
		return beverage.getDescription() + ", Mocha";
	}

	public double cost() {
		return COST + beverage.cost();
	}
}