package Cart;

public class App {
  public static void main(String[] args) {
    Cart cart = new Cart();
    Product product = new Product("1", 10);
    Product product2 = new Product("1", 10);
    Product product3 = new Product("1", 10);
    Product product4 = new Product("1", 10);
    Product product5 = new Product("1", 10);
    Product product6 = new Product("1", 10);
    Product product7 = new Product("1", 2220);
    Product product8 = new Product("1", 24430);

    cart.add(product);
    cart.add(product2);
    cart.add(product3);
    cart.add(product4);
    cart.add(product5);
    cart.add(product6);
    System.out.println(cart.calculateTotalCartValue());
  }
}
