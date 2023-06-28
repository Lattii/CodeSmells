public class DrillPrice extends ProductPrice {
    private Drill drill;
    public DrillPrice(IProduct product) {
        super(product);
        this.drill = drill;
    }

    @Override
    protected double calculatePrice() {
        return calculateRentPrice() * calculateInsurance();
    }

    @Override
    protected double calculateRentPrice() {
        return 5;
    }

    @Override
    protected double calculateInsurance() {
        return 1;
    }
}