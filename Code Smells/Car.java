public class Car implements IProduct {
    private String brand;
    private int weight;
    private int engineCapacity;
    private double rentPrice;
    private double Insurance;
    private boolean rented;
    private Customer customer;

    public Car(String brand, int weight, int engineCapacity, double rentPrice, double Insurance) {
        this.brand = brand;
        this.weight = weight;
        this.engineCapacity = engineCapacity;
        this.rentPrice = rentPrice;
        this.Insurance = Insurance;
    }

    public CarPrice createPriceCalculator() {
        return new CarPrice(this);
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    @Override
    public String GetDetails() {
        return
                "Car: " + this.getBrand() + ", Weight: " + this.getWeight() +
                        ", RentPrice: " + this.getRentPrice() + ", Insurance: " +
                        this.getInsurance() + ", Rental Status: " + this.isRented();
    }

    public String getBrand() {
        return brand;
    }

    public int getWeight() {
        return weight;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public double getRentPrice() {
        return rentPrice;
    }

    public double getInsurance() {
        return Insurance;
    }

    @Override
    public void assignCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public Customer getCustomer() {
        return customer;
    }

}
