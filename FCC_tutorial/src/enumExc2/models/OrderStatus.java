package enumExc2.models;

public enum OrderStatus {
    NEW("New Order" ),
    PAID("Order paid" ),
    SHIPPED("Order shipped" ),
    DELIVERED("Order delivered" ),
    CANCELLED("Order cancelled" );

    private String description;
    OrderStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
