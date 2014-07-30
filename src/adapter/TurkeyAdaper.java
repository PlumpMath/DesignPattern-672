package adapter;

public class TurkeyAdaper implements Duck {

	private Turkey turkey;

	public TurkeyAdaper(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		turkey.gobble();

	}

	@Override
	public void fly() {
		turkey.fly();
	}

}
