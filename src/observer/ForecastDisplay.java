package observer;

public class ForecastDisplay implements Observer, DisplayElement {
	private float currentPressure = 29.92f;
	private float lastPressure;
	private WeatherData weatherData;
	
	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

//	@Override
//	public void update(float temp, float humidity, float pressure) {
//		// TODO 自動生成されたメソッド・スタブ
//
//	}
	
	@Override
	public void update() {
		lastPressure = currentPressure;
		currentPressure= weatherData.getPressure();
		display();
	}
	
	@Override
	public void display() {
		System.out.print("予報；");
		if (lastPressure < currentPressure) {
			System.out.println("気温は良くなります！");
		} else if (lastPressure > currentPressure) {
			System.out.println("寒い雨模様の天候に注意してください");
		} else {
			System.out.println("ほとんど同じです");
		}
	}

}
