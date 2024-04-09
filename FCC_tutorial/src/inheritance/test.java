package inheritance;

public class test {
    public static void main(String[] args) {
        Part part = new Part("okok", "nipoko", 1312313);
        Tire tire = new Tire("tire", "best one", 13123554, 50, 20);
        ExhaustPart exhaustPart = new ExhaustPart("exhaus", "rusty", 213978374, true);


        System.out.println(tire.getManufacturer());
        System.out.println(tire.getTireWidth());

    }
}
