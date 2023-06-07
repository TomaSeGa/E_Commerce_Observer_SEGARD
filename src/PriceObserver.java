public class PriceObserver implements OrderObserver{
    public void update(Order order){
        if(order.getTotalPrice() > 200){
            order.price = order.price-20;
        }
    }
}
