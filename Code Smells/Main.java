import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create instances of the factories
        ProductInventoryObservable subject = new ProductInventoryObservable();

        RentAThing drillFactory = new DrillFactory();
        RentAThing truckFactory = new TruckFactory();
        RentAThing carFactory = new CarFactory();


        // Create a ProductInventory instance
        ProductInventory productInventory = new ProductInventory(subject);

        // Create and add Products to the inventory
        IProduct drill1 = drillFactory.createDrill("Bosch", "Compound", 10.5, 2.3);
        IProduct drill2 = drillFactory.createDrill("DeWalt", "Diamond", 14.5, 4.3);
        IProduct drill3 = drillFactory.createDrill("Makita", "Steel", 12.0, 3.3);
        IProduct truck1 = truckFactory.createTruck( "Ford", 800, 950, 40.6, 23.6);
        IProduct truck2 = truckFactory.createTruck("GMC",1300, 1050, 55.5, 27.3);
        IProduct truck3 = truckFactory.createTruck("Volkswagen",1500, 900, 60.1, 31.4);
        IProduct car1 = carFactory.createCar("Lamborghini", 523, 350, 70.1, 4.7);
        IProduct car2 = carFactory.createCar("Audi", 450, 420, 52.4, 2.9);
        IProduct car3 = carFactory.createCar("Bugatti", 320, 395, 83.6, 6.4);
        productInventory.addProductToList(drill1);
        productInventory.addProductToList(drill2);
        productInventory.addProductToList(drill3);
        productInventory.addProductToList(truck1);
        productInventory.addProductToList(truck2);
        productInventory.addProductToList(truck3);
        productInventory.addProductToList(car1);
        productInventory.addProductToList(car2);
        productInventory.addProductToList(car3);

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        ProductOverview productOverview = new ProductOverview(subject);

        // Create an instance of the Menu class
        Menu menu = new Menu(productOverview, productInventory, scanner);

        // Run the menu
        menu.run();

        // Close the scanner
        scanner.close();
    }
}

