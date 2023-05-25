package Decorator;

public class Decaf extends Beverage {

	public Decaf() {
		description = "カフェインレス";
	}
	
	@Override
	public double cost() {
		return 1.05;
	}

}
