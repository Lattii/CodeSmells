public class TruckFactory extends RentAThing {
    @Override
    public IProduct createDrill(String brand, String type, double price, double insurance)
    {
        return null;
    }

    @Override
    public IProduct createTruck(String brand, int payload, int engineCapacity, double rentPrice, double insurance) {
        return new Truck(brand, payload, engineCapacity, rentPrice, insurance);
    }

    @Override
    public  IProduct createCar(String brand, int weight, int payload, double rentPrice, double insurance)
    {
        return null;
    }

    @Override
    public IProduct createCustomDrill(RentAThing factory) {
        return null;
    }

    @Override
    public IProduct createCustomTruck(RentAThing factory) {
        System.out.print("Enter the Truck brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter the Truck Weight Storage: ");
        int payload = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter the Truck Motor Size: ");
        int engineCapacity = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter the rental price: ");
        double rentPrice = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter the insurance cost: ");
        double insurance = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        return factory.createTruck(brand, payload, engineCapacity, rentPrice, insurance);
    }

    @Override
    public IProduct createCustomCar(RentAThing factory) {
        return null;
    }
}
