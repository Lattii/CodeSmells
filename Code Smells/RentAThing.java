import java.util.Scanner;

public abstract class RentAThing {
    protected Scanner scanner = new Scanner(System.in);
    public abstract IProduct createDrill(String brand, String type, double price, double insurance);
    public abstract IProduct createTruck(String brand, int payload, int engineCapacity, double rentPrice, double insurance);
    public abstract IProduct createCar(String brand, int weight, int payload, double rentPrice, double insurance);

    public abstract IProduct createCustomDrill(RentAThing factory);
    public abstract IProduct createCustomTruck(RentAThing factory);
    public abstract IProduct createCustomCar(RentAThing factory);
}

