import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductInventory implements IProductObserver {
    private Scanner scanner = new Scanner(System.in);
    private List<IProduct> products;
    private ProductInventoryObservable subject;

    public ProductInventory(ProductInventoryObservable subject) {
        this.subject = subject;
        products = new ArrayList<>();
        subject.addObserver(this::inventoryUpdate);
    }

    public void addProductToInventory() {
        System.out.print("Enter the product type (Drill, Truck, Car): ");
        String productType = scanner.nextLine();

        RentAThing factory;
        switch (productType.toLowerCase()) {
            case "drill":
                factory = new DrillFactory();
                break;
            case "truck":
                factory = new TruckFactory();
                break;
            case "car":
                factory = new CarFactory();
                break;
            default:
                System.out.println("Invalid product type. Please try again.");
                return;
        }

        IProduct product = null;
        switch (productType.toLowerCase()) {
            case "drill":
                product = factory.createCustomDrill(factory);
                break;
            case "truck":
                product = factory.createCustomTruck(factory);
                break;
            case "car":
                product = factory.createCustomCar(factory);
                break;
            default:
                System.out.println("Invalid product type. Please try again.");
        }

        if (product != null) {
            addProductToList(product);
            System.out.println("Product has been added to inventory.");
        }
        System.out.println();
    }

    public void addProductToList(IProduct product) {
        products.add(product);
        //Observer
        subject.notifyObservers();
    }

    public void removeProductFromInventory() {
        System.out.println("Select the product that you wish to remove:");
        List<IProduct> products = getProducts();
        for (int i = 0; i < products.size(); i++) {
            IProduct product = products.get(i);
            String productName;
            productName = product.GetDetails();
            System.out.println((i + 1) + ". " + productName);
        }

        System.out.println("Enter the product number which you would like to remove: ");
        int productNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        if (productNumber < 1 || productNumber > products.size()) {
            System.out.println("Invalid product number. Please try again.");
            return;
        }

        IProduct productToRemove = products.get(productNumber - 1);
        products.remove(productToRemove);
        System.out.println("Product has been removed from inventory.");
        subject.notifyObservers();
        System.out.println();
    }

    public List<IProduct> getProducts() {
        return products;
    }

    @Override
    public void inventoryUpdate() {
        System.out.println("Product inventory has been updated");
    }
}

