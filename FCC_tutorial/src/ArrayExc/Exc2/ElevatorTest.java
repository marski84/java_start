package ArrayExc.Exc2;

public class ElevatorTest {

    public static void main(String[] args) throws InterruptedException {
        Elevator elevator = new Elevator();
        Person firstPerson = new Person();
        Person secondPerson = new Person();
        Person thirdPerson = new Person();
        Person fourthPerson = new Person();
        elevator.add(firstPerson);
        elevator.add(secondPerson);
        elevator.add(thirdPerson);
        elevator.add(fourthPerson);
//        elevator.add(fourthPerson);
//        elevator.getArrInfo();
        elevator.start();

    }
}
