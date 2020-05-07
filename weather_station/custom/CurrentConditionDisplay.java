public class CurrentConditionDisplay implements Observer, DisplayElement {
	private float temp;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float t, float h, float p) {
		temp = t;
		humidity = h;
		pressure = p;
		updated();
	}

	private void updated() {
		display();
	}

	public void display() {
		System.out.println("Current condition is: temp - " + temp + ", humidity - " + humidity + ", pressure - " + pressure + ";");
	}
}