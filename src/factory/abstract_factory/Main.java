package factory.abstract_factory;

public class Main {

	public static void main(String[] args) {
		PizzaStore nyPizzaStore = new NYPizzaStore();
		nyPizzaStore.orderPizza();
		
		PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
		chicagoPizzaStore.orderPizza();
	}

}
