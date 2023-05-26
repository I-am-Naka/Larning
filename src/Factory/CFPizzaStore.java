package Factory;

public class CFPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
		if (type.equals("チーズ")) {
			pizza = new CFPizzaCheesePizza();
		} else if (type.equals("ペパロニ")) {
			pizza = new CFPizzaPepperoniPizza();
		} else if (type.equals("アサリ")) {
			pizza = new CFPizzaClamPizza();
		} else if (type.equals("野菜")) {
			pizza = new CFPizzaVeggiePizza();
		} else return null;
	}
}
