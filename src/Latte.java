public class Latte extends CoffeeTemplate {
    @Override
    protected void brew() {
        System.out.println("Brewing Latte");
    }

    @Override
    protected void pourInCup() {
        System.out.println("Pouring Latte into cup");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding milk to Latte");
    }
}
