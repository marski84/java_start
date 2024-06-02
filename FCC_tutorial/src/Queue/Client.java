package Queue;

import lombok.Data;

@Data
public class Client implements Comparable<Client> {
    private String name;
    private int orders;

    public Client(String name, int orders) {
        this.name = name;
        this.orders = orders;
    }

    @Override
    public int compareTo(Client o) {
        return -Integer.compare(orders, o.orders);
    }
}
