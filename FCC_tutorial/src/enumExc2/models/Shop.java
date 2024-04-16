package enumExc2.models;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

public class Shop {
    private final int ORDER_AMOUNT = 5;
    private Order[] orderList = new Order[ORDER_AMOUNT];
    private int orderCounter = 0;

    public void addOrder(Order order) {
        if (orderCounter == ORDER_AMOUNT) {
            return;
        }
        orderList[orderCounter] = order;
        orderCounter++;
//        System.out.println(order.getProduct() + " added");
    }

    public Order[] getFilteredList(OrderStatus orderStatus) {
        System.out.println(orderList[0]);

        for (Order order : orderList) {
            if (order != null && order.getStatus() == orderStatus) {
                System.out.println(
                        order.getProduct() + ", cena: " + order.getPrice() + "- " + order.getStatus().getDescription()
                );
            }
        }

        Order[] filteredOrderList = Arrays.stream(orderList)
                .filter(order -> order != null)
                .filter(order -> order.getStatus() == orderStatus)
                .toArray(Order[]::new);


        return filteredOrderList;
    }


}
