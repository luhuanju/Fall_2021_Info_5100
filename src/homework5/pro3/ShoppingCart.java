package homework5.pro3;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ShoppingCart {

    private Set<Item> itemSet=new HashSet<>();
    int totalPrice=0;
    public void addItem(Item item1) {
        itemSet.add(item1);
        this.totalPrice+= item1.getPrice();
    }
    public void removeItem(Item item1){
        itemSet.remove(item1);
    }
    public int calculateTotal(){
        return this.totalPrice;
    }
    public void pay(PaymentStrategy strategy){
        strategy.pay(this.totalPrice);
    }
}
