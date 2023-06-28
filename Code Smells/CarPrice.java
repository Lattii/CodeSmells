public class CarPrice extends ProductPrice {
    private Car car;
    public CarPrice(Car car) {
        super(car);
        this.car = car;
    }

    @Override
    protected double calculatePrice() {
        return calculateRentPrice() * calculateInsurance();
    }

    @Override
    protected double calculateRentPrice() {
        return 50;
    }

    @Override
    protected double calculateInsurance() {
        return car.getEngineCapacity() * 0.01; // 0.01 euro per cc engineCapacity// per day
    }
}