public class TruckPrice extends ProductPrice {
    private Truck truck;

    public TruckPrice(Truck truck) {
        super(truck);
        this.truck = truck;
    }

    @Override
    protected double calculatePrice() {
        return calculateRentPrice() * calculateInsurance();
    }

    @Override
    protected double calculateRentPrice() {
        return truck.getPayload() * 0.10;
    }

    @Override
    protected double calculateInsurance() {
        return truck.getEngineCapacity() * 0.01; // 0.01 euro per cc motorinhoud per day
    }
}
