public class Espresso extends Beverage {
	static double COST = 1.99;

	public Espresso () {
		description = "Espresso";
	}

	public double cost() {
		return COST;
	}
}