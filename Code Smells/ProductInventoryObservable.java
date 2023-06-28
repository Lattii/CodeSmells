import java.util.ArrayList;
import java.util.List;

public class ProductInventoryObservable {
    private List<IProductObserver> observers;

    public ProductInventoryObservable() {
        observers = new ArrayList<>();
    }

    public void addObserver(IProductObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(IProductObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (IProductObserver observer : observers) {
            observer.inventoryUpdate();
        }
    }
}