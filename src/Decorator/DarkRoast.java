package Decorator;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "ダークロースト";
	}
	
	@Override
	public double cost() {
		return 0.99;
	}

}
