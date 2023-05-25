package Decorator;

public class Soy extends CondimentDecorator {

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + "、豆乳";
	}

	@Override
	public double cost() {
		double additionalCost = 0;
		Size originSize = getSize();
		if(originSize == Size.TALL) {
			additionalCost = 0.10;
		} else if (originSize == Size.GRANDE) {
			additionalCost = 0.15;
		} else {
			additionalCost = 0.20;
		}
		return beverage.cost() + additionalCost;
	}

}
