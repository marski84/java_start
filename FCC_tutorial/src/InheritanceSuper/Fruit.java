package InheritanceSuper;

public class Fruit {
    private int weight;
    private String type;

    public Fruit(int weight, String type) {
        this.weight = weight;
        this.type = type;
    }

    String getInfo() {
        return "Waga " + getWeight() + ", " + "typ: " + getType();
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
