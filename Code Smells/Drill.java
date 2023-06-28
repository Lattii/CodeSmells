public class Drill implements IProduct {
    private String brand;
    private String type;
    private double rentPrice;
    private double Insurance;
    private boolean rented;
    private Customer customer;

    public Drill(String brand, String type, double rentPrice, double insurance) {
        this.brand = brand;
        this.type = type;
        this.rentPrice = rentPrice;
        this.Insurance = insurance;
    }

    public DrillPrice createPriceCalculator() {
        return new DrillPrice(this);
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public double getRentPrice() {
        return rentPrice;
    }

    public double getInsurance() {
        return Insurance;
    }

    public String GetDetails() {
        return
                "Drill: " + this.getBrand() + ", Type: " + this.getType() +
                        ", RentPrice: " + this.getRentPrice() + ", Insurance: " + this.getInsurance() +
                        ", Rental Status: " + this.isRented();

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
