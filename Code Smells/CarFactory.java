public class CarFactory extends RentAThing {
    @Override
    public IProduct createDrill(String brand, String type, double price, double insurance)
    {
        return null;
    }
    @Override
    public IProduct createTruck(String brand, int payload, int engineCapacity, double rentPrice, double insurance) {
        return null;
    }

    @Override
    public  IProduct createCar(String brand, int weight, int payload, double rentPrice, double insurance)
    {
        return new Car(brand, weight, payload, rentPrice, insurance);
    }

    @Override
    public IProduct createCustomDrill(RentAThing factory) {
        return null;
    }

    @Override
    public IProduct createCustomTruck(RentAThing factory) {
        return null;
    }

    @Override
    public IProduct createCustomCar(RentAThing factory) {
        System.out.print("Enter the Car brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter the Car Weight: ");
        int weight = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter the Car Motor Size: ");
        int engineCapacity = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter the rental price: ");
        double rentPrice = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter the insurance cost: ");
        double insurance = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        return factory.createCar(brand, weight, engineCapacity, rentPrice, insurance);
    }
}
