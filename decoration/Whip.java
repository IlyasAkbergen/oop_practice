public class Whip extends CondimentDecorator {
	static double COST = .15;
	Beverage beverage;

	public Whip(Beverage b){
		beverage = b;
	}

	public String getDescription () {
		return beverage.getDescription() + ", Whip";
	}

	public double cost() {
		return COST + beverage.cost();
	}
}