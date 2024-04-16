package enumExc2.models;

public class Order {
    private String product;
    private int price;
    private OrderStatus status;

    public Order(String product, int price, OrderStatus status) {
        this.product = product;
        this.price = price;
        this.status = status;
    }

    public String getProduct() {
        return product;
    }

    public int getPrice() {
        return price;
    }

    public OrderStatus getStatus() {
        return status;
    }


}
