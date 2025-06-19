public class WhippedCream extends CoffeeDecorator {
    public WhippedCream(Coffee c) {
        super(c);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Whipped Cream";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.3;
    }
}
