import java.util.ArrayList;

public class WeatherData implements Subject {
	private ArrayList observers;
	private float temp;
	private float humidity;
	private float pressure;

	public WeatherData(){
		observers = new ArrayList();
	}

	public float getTemperature(){
		return temp;
	}

	public float getHumidity(){
		return humidity;
	}

	public float getPressure(){
		return pressure;
	}

	public void registerObserver(Observer o){
		observers.add(o);
	}
	
	public void removeObserver(Observer o){
		int i = observers.indexOf(o);
		if (i >= 0) observers.remove(i); 
	}

	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer o = (Observer) observers.get(i);
			o.update(getTemperature(), getHumidity(), getPressure());
		} 
	}

	public void measurementChanged() {
		notifyObservers();
	}

	public void setMeasurements(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
	}
}