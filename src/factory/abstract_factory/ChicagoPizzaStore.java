package factory.abstract_factory;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza() {
		PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
		Pizza pizza = new ChicagoPizza(pizzaIngredientFactory);
		pizza.setName("ChicagoPizza");
		return pizza;
	}

}
