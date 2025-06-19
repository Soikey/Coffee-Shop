public class Espresso extends CoffeeTemplate {
    @Override
    protected void brew() {
        System.out.println("Brewing Espresso");
    }

    @Override
    protected void pourInCup() {
        System.out.println("Pouring Espresso into cup");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar to Espresso");
    }
}
