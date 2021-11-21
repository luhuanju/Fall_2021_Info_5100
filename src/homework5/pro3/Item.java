package homework5.pro3;

public class Item {
    int price;
    String id;

    public Item( String id,int price) {
        this.price = price;
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }
}
