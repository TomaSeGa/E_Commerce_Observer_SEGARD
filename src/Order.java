import java.util.ArrayList;
import java.util.List;

public class Order {
    public double price;
    public int quantity;

    public int id;
    public Order(double price, int quantity, int id) {
        this.price = price;
        this.quantity = quantity;
        this.id = id;
    }

    private List<OrderObserver> Observers = new ArrayList<OrderObserver>();

    public void attach(OrderObserver obs){
        Observers.add(obs);
    }

    public void detach(OrderObserver obs){
        Observers.remove(obs);
    }

    public double getTotalPrice(){
        return price=price+10.0;
    }

    public int getCount(){
        return quantity;
    }

    public void additem(){

        PriceObserver tPrice = new PriceObserver();
        QuantityObserver tQuantity = new QuantityObserver();

        this.attach(tPrice);
        this.attach(tQuantity);

        tPrice.update(this);
        tQuantity.update(this);
    }

    @Override
    public String toString() {
        return "Price:"+this.price+"$"+" Quantity:"+this.quantity+" items";
    }
}

