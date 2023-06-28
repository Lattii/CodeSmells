public interface IProduct {
    ProductPrice createPriceCalculator();
    boolean isRented();
    void setRented(boolean rented);
    String GetDetails();

    void assignCustomer(Customer customer);

    Customer getCustomer();
}
