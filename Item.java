public class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName() {
        return new String(name);
    }
    public double getPrice() {
        return this.price;
    }
    public int getQuantity() {
        return this.quantity;
    }
    public void setName (String newName) {
        this.name = newName;
    }
    public void setPrice (double newPrice) {
        this.price = newPrice;
    }
    public void setQuantity (int newQuantity) {
        this.quantity = newQuantity;
    }
    public Item (Item item) {
        this.name = item.name;
        this.price = item.price;
        this.quantity = item.quantity;
    }
    public String toString() {
       return name + ":" + price + "(" + quantity + ")";
    }

}
