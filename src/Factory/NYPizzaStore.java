package Factory;

public class NYPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
		if (item.equals("チーズ")) {
			return new NYStyleCheesePizza();
		} else
			/*if (item.equals("ペパロニ")) {
			return new NYStylePepperoniPizza();
			} else if (item.equals("アサリ")) {
			return new NYStyleClamPizza();
			} else if (item.equals("野菜")) {
			return new NYStyleVeggiePizza();
			} else*/ return null;
	}
}
