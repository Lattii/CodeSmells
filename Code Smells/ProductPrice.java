public abstract class ProductPrice {
    protected IProduct product;

    public ProductPrice(IProduct product) {
        this.product = product;
    }

    protected abstract double calculatePrice();
    protected abstract double calculateRentPrice();
    protected abstract double calculateInsurance();
}
