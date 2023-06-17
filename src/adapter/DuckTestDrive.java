package adapter;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("Turkeyの出力");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nDuckの出力");
        testDuck(duck);

        System.out.println("\nTrukeyAdapterの出力：");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
