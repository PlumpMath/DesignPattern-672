package observer.custom_observer;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		// register to the subject when instantiation 
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(
				weatherData);
		
		weatherData.setMeasurements(25, 20, 30);
		weatherData.setMeasurements(24, 21, 32);
	}

}
