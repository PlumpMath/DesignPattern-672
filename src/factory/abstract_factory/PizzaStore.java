package factory.abstract_factory;

public abstract class PizzaStore {
	
	public Pizza orderPizza() {
		Pizza pizza = createPizza();
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	abstract Pizza createPizza();
	

}
