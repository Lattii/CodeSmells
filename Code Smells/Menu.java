import java.util.Scanner;

public class Menu {
    private ProductOverview productOverview;
    private ProductInventory productInventory;
    private Scanner scanner;

    public Menu(ProductOverview productOverview, ProductInventory productInventory, Scanner scanner) {
        this.productOverview = productOverview;
        this.productInventory = productInventory;
        this.scanner = scanner;
    }

    public void run() {
        UserLogin user = new UserLogin();
        user.loginValidate();
        boolean exit = false;
        while (!exit) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    productOverview.showAllProducts(productInventory);
                    break;
                case 2:
                    productOverview.searchProductType(productInventory);
                    break;
                case 3:
                    productInventory.addProductToInventory();
                    break;
                case 4:
                    productInventory.removeProductFromInventory();
                    break;
                case 5:
                    user.loginValidate();
                    break;
                case 6:
                    user.logout();
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void displayMenu() {
        User currentUser = UserAccountSingleton.getInstance().getCurrentUser();
        System.out.println("Logged in as: " + (currentUser != null ? currentUser.getUsername() : "Guest"));
        System.out.println("1: Show all products");
        System.out.println("2: Search for a product");
        System.out.println("3: Create product");
        System.out.println("4: Remove product");
        System.out.println("5: Login");
        System.out.println("6: Logout");
        System.out.println("7: Exit");
        System.out.print("Enter your choice: ");
    }
}
