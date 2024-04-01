package ArrayExc.Exc2;

import java.util.Random;

public class Person {
    private Random random = new Random();
    private Random randomWeight = new Random();
    private int id;
    private int weight;

    Person() {
        this.id = random.nextInt(999);
        this.weight = randomWeight.nextInt(85) + 50;
    }

    public int getId() {
        return id;
    }

    public int getWeight() {
        return weight;
    }
}
