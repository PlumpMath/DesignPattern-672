package factory.factory_method;

public class Main {

	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("I ordered a " + pizza.getName());
		
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("I ordered a " + pizza.getName());
	}

}
