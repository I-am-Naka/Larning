package Factory;

public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza() {
		name = "シカゴスタイルのディープディッシュチーズピザ";
		dough = "極厚クラスト生地";
		sauce = "プラムトマトソース";
		
		toppings.add("シュレッドモッツァレラチーズ");
	}

	void cut() {
		System.out.println("ピザを四角形にカットする");
	}
}
