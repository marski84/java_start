package enumExc2;

import enumExc2.models.Order;
import enumExc2.models.OrderStatus;
import enumExc2.models.Shop;

import java.util.Arrays;

public class ShopImpl {
    public static void main(String[] args) {
        Order first = new Order("fdfsf", 666, OrderStatus.NEW);
        Order second = new Order("fdsfdfsf", 666, OrderStatus.NEW);
        Order third = new Order("zzzzz", 666, OrderStatus.PAID);
        Order fourth = new Order("wwww", 666, OrderStatus.PAID);
        Order fifth = new Order("yyy", 666, OrderStatus.PAID);

        Shop shop = new Shop();
        shop.addOrder(first);
        shop.addOrder(second);
        shop.addOrder(third);
        shop.addOrder(fourth);
        shop.addOrder(fifth);
        Order[] filteredList = shop.getFilteredList(OrderStatus.NEW);
        Arrays.stream(filteredList).forEach(order -> System.out.println(order.getProduct() + ", " + order.getStatus().getDescription()));


    }
}
