package InheritanceSuper;

public class Apple extends Fruit {
    private String brand;

    Apple(int weight, String brand) {
        super(weight, "AppleType");
        this.brand = brand;
    }

    @Override
    String getInfo() {
        return super.getInfo() + ", brand: " + brand;
    }
}
