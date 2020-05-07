public class StatisticsDisplay implements Observer, DisplayElement {
	private float temp;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	
	public StatisticsDisplay(Subject weatherData) {
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
		System.out.println(
			String.format("Displaying stats")
		);
	}
}