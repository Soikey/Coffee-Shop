public class CoffeeFactory {
    public static CoffeeTemplate createCoffee(String type) {
        if(type.equalsIgnoreCase("Latte")) {
            return new Latte();
        } else if(type.equalsIgnoreCase("Espresso")) {
            return new Espresso();
        } else {
            throw new IllegalArgumentException("Unknown coffee type: " + type);
        }
    }
}
