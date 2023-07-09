package template;

public class BeverageTestDrive {
    public static void main(String[] args) {
        
        TeaWithHook teaHook = new TeaWithHook();
        TeaWithHook coffeeHook = new TeaWithHook();

        System.out.println("\nMaking tea...");
        teaHook.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffeeHook.prepareRecipe();
    }
}
