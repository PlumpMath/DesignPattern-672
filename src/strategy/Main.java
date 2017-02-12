package strategy;

public class Main {
	
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performFly();
		mallard.performQuack();
		
		ModelDuck model = new ModelDuck();
		model.setFlyBehavior(new FlyRocketPowered());
		model.display();
		model.performFly();
		model.performQuack();
	}

}
