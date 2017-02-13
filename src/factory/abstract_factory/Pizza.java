package factory.abstract_factory;

public abstract class Pizza {
	
	String name;
	Dough dough;
	Sauce sauce;
	Cheese cheese;
	
	abstract void prepare();
	
	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	
	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}

}
