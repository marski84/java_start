package CarWithStatus;

public class CarTest {
    public static void main(String[] args) {
        Car firstCar = new Car(200, true, true, true, false);
        Car secondCar = new Car(0, true, true, true, false);
        System.out.println(secondCar.start());
        System.out.println(secondCar.status());

    }
}
