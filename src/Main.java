import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Coffee Type Selection
        System.out.println("Welcome to the Coffee Shop!");
        System.out.println("Select Coffee Type:");
        System.out.println("1. Latte");
        System.out.println("2. Espresso");
        System.out.print("Enter choice (1 or 2): ");
        int coffeeChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        CoffeeTemplate coffeeTemplate;
        if (coffeeChoice == 1) {
            coffeeTemplate = CoffeeFactory.createCoffee("Latte");
        } else {
            coffeeTemplate = CoffeeFactory.createCoffee("Espresso");
        }

        // Step 2: Brewing Strategy Selection
        System.out.println("\nSelect Brewing Method:");
        System.out.println("1. Hot Brew");
        System.out.println("2. Cold Brew");
        System.out.print("Enter choice (1 or 2): ");
        int brewChoice = scanner.nextInt();
        BrewingStrategy strategy;
        if (brewChoice == 1) {
            strategy = new HotBrew();
        } else {
            strategy = new ColdBrew();
        }

        // Step 3: Decorators (Add-ons) Selection
        Coffee coffee = new BasicCoffee();
        boolean adding = true;
        while (adding) {
            System.out.println("\nAdd Ingredients:");
            System.out.println("1. Milk");
            System.out.println("2. Caramel");
            System.out.println("3. No more ingredients");
            System.out.print("Enter choice: ");
            int decoratorChoice = scanner.nextInt();

            switch (decoratorChoice) {
                case 1:
                    coffee = new Milk(coffee);
                    break;
                case 2:
                    coffee = new Caramel(coffee);
                    break;
                case 3:
                    adding = false;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        // Step 4: Prepare Coffee using Template Method
        System.out.println("\n--- Preparing Your Coffee ---");
        coffeeTemplate.prepareCoffee();

        // Step 5: Apply Brewing Strategy
        System.out.println("--- Brewing Strategy Applied ---");
        strategy.brewMethod();

        // Step 6: Final Coffee Details
        System.out.println("\n--- Order Summary ---");
        System.out.println("Coffee: " + coffee.getDescription());
        System.out.println("Total Cost: $" + coffee.getCost());

        scanner.close();
    }
}
