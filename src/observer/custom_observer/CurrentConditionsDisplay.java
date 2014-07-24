package observer.custom_observer;

/**
 * 
 * Only show the current temperature and humidity
 * 
 * @author zseashell
 * 
 */
public class CurrentConditionsDisplay implements Observer, Display {

	private float temperature;

	private float humidity;

	private Subject weatherData;

	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.printf("Current condition: %f degrees and humidity %f\n",
				temperature, humidity);

	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

}
