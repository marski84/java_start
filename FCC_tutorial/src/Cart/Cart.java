package Cart;

public class Cart {
  private final int MAX_ITEMS = 10;
  private Product[] cart = new Product[MAX_ITEMS];
  private int productCounter = 0;

  public void add(Product product) {
    if (productCounter >= MAX_ITEMS) {
      System.out.println("Cart limit exceeded");
    }
    cart[productCounter] = product;
    productCounter++;
  }

  public double calculateTotalCartValue() {
    return calculateWithRecursion(productCounter);
  }

  private double calculateWithRecursion(int productCounter) {
    double sum = 0;
    if (productCounter != 0) {
      sum = sum + cart[productCounter - 1].getPrice();
      return sum + calculateWithRecursion(productCounter - 1);
    }
    return sum;
  }
}
