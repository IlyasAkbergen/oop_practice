import java.util.Observer;
import java.util.Observable;

public class CurrentConditionDisplay implements Observer, DisplayElement {
	private float temp;
	private float humidity;
	private Observable observable;
	public CurrentConditionDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) obs;
			this.temp = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			updated();
		}
	}

	private void updated() {
		display();
	}

	public void display() {
		System.out.println("Current condition is: temp - " + temp + ", humidity - " + humidity + ";");
	}
}