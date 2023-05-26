package Factory;

public class SimplePizzaFactory {
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if (type.equals("チーズ")) {
			pizza = new CheesePizza();
		} else if (type.equals("ペパロニ")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("アサリ")) {
			pizza = new ClamPizza();
		} else if (type.equals("野菜")) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}
}
