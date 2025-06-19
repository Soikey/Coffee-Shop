public class Caramel extends CoffeeDecorator {
    public Caramel(Coffee c) {
        super(c);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Caramel";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.7;
    }
}
