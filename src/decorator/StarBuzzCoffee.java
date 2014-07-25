package decorator;

public class StarBuzzCoffee {

	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());

		// HouseBlend, 0.89
		Beverage beverageWithCondiment = new HouseBlend();
		// one Mocha, +0.20
		beverageWithCondiment = new Mocha(beverageWithCondiment);
		// double Mocha, +0.20
		beverageWithCondiment = new Mocha(beverageWithCondiment);
		// one Whip, +0.10
		beverageWithCondiment = new Whip(beverageWithCondiment);
		System.out.println(beverageWithCondiment.getDescription() + " $"
				+ beverageWithCondiment.cost());

	}

}
