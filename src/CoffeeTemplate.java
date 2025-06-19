public abstract class CoffeeTemplate {
    public final void prepareCoffee() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected void boilWater() {
        System.out.println("Boiling water");
    }

    protected abstract void brew();
    protected abstract void pourInCup();
    protected abstract void addCondiments();
}
