import java.util.Scanner;

public class ProductRental implements IProductObserver {
    private Scanner scanner = new Scanner(System.in);
    private ProductInventoryObservable subject = new ProductInventoryObservable();

    public ProductRental() {
        this.subject.addObserver(this);
    }

    public void rentProduct(IProduct product) {
        if (!product.isRented()) {
            product.setRented(true);
            System.out.print("Enter customer name: ");
            String customerName = scanner.nextLine();
            Customer customer2 = new Customer(customerName);
            UserAccountSingleton.getInstance().addCustomer(customer2);
            product.assignCustomer(customer2);
            subject.notifyObservers();
        } else {
            System.out.println("This product is already rented.");
        }
    }

    public void returnProduct(IProduct product) {
        if (product.isRented()) {
            product.setRented(false);
            //System.out.println("Returning " + product.getName());
            subject.notifyObservers();
        } else {
            System.out.println("This product is not currently rented.");
        }
    }


    public void rentOptions(IProduct product) {
        System.out.println("Options:");
        System.out.println("1: Rent Product");
        System.out.println("2: Return Product");
        System.out.println("3: Back");
        System.out.println("Enter number:");

        int option = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (option) {
            case 1:
                rentProduct(product);
                break;
            case 2:
                returnProduct(product);
                break;
            case 3:
                break;
            default:
                System.out.println("Invalid option");
        }
    }

    @Override
    public void inventoryUpdate() {
        System.out.println("Product Status has been updated. Refreshing of the product overview has concluded");
    }
}

