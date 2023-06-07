public class Client {
    public Order order;

    public Order new_order(){
        Order commande = new Order(210, 4, 1);

        commande.additem();
        System.out.println(commande);
        return commande;
    }
}