class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		CurrentConditionDisplay conditionsDisplay = new CurrentConditionDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 67, 29.3f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}