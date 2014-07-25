package factory.abstract_factory;

public class NYPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza() {
		PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
		Pizza pizza = new NYPizza(pizzaIngredientFactory);
		pizza.setName("NYPizza");
		return pizza;
	}

}
