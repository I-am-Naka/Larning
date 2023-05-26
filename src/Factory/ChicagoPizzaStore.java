package Factory;

public class ChicagoPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
		if (item.equals("チーズ")) {
			return new ChicagoStyleCheesePizza();
		} else
			/*if (item.equals("ペパロニ")) {
			return new ChicagoStylePepperoniPizza();
			} else if (item.equals("アサリ")) {
			return new ChicagoStyleClamPizza();
			} else if (item.equals("野菜")) {
			return new ChicagoStyleVeggiePizza();
			} else*/ return null;
	}
}
