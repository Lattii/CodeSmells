public class DrillFactory extends RentAThing {
    @Override
    public IProduct createDrill(String brand, String type, double rentPrice, double insurance) {
        return new Drill(brand, type, rentPrice, insurance);
    }

    @Override
    public IProduct createTruck(String brand, int payload, int engineCapacity, double rentPrice, double insurance)
    {
        return null;
    }

    @Override
    public IProduct createCar(String brand, int weight, int payload, double rentPrice, double insurance) {
        return null;
    }

    @Override
    public IProduct createCustomDrill(RentAThing factory) {
        System.out.print("Enter the drill brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter the drill type: ");
        String type = scanner.nextLine();

        System.out.print("Enter the rental price: ");
        double rentPrice = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter the insurance cost: ");
        double insurance = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        return factory.createDrill(brand, type, rentPrice, insurance);
    }

    @Override
    public IProduct createCustomTruck(RentAThing factory) {
        return null;
    }

    @Override
    public IProduct createCustomCar(RentAThing factory) {
        return null;
    }
}
