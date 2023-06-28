public class Truck implements IProduct {

    private String brand;
    private int payload;
    private int engineCapacity;
    private double rentPrice;
    private double insurance;
    private boolean rented;
    private Customer customer;

    public Truck(String brand, int payload, int engineCapacity, double rentPrice, double insurance) {
        this.brand = brand;
        this.payload = payload;
        this.engineCapacity = engineCapacity;
        this.rentPrice = rentPrice;
        this.insurance = insurance;
    }

    public TruckPrice createPriceCalculator() {
        return new TruckPrice(this);
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
                "Truck: " + this.getBrand() + ", payload: " + this.getPayload() + "KG, engineCapacity: " + this.getEngineCapacity() + "L, " +
                        "RentPrice: " + this.getRentPrice() + ", Insurance: " +
                        this.getInsurance() + ", Rental Status: " + this.isRented();

    }

    public String getBrand() {
        return brand;
    }
    public int getPayload() {
        return payload;
    }
    public int getEngineCapacity() {
        return engineCapacity;
    }
    public double getRentPrice() {
        return rentPrice;
    }
    public double getInsurance() {
        return insurance;
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
