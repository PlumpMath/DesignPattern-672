package adapter;

public class DuckTestDrive {

	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		testDuck(mallardDuck);

		Turkey turkey = new WildTurkey();
		Duck turkeyAdaper = new TurkeyAdaper(turkey);
		testDuck(turkeyAdaper);
	}

	private static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}

}
