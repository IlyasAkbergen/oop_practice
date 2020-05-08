public class StarbuzzCoffee {
	public static void main(String[] args) {
		Beverage b1 = new Espresso();
		b1 = new Mocha(b1);
		b1 = new Whip(b1);

		System.out.println(b1.getDescription() + " $" + b1.cost());
	}
}