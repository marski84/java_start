package ArrayExc.Exc2;

public class Elevator {
    private Person[] peopleInElevator;
    private int weightLimit;
    private int personLimit;
    private int peopleAdded = 0;

    Elevator() {
        this.weightLimit = 400;
        this.peopleInElevator = new Person[4];
        this.personLimit = 4;

    }

    Elevator(int weightLimit, int maxPerson) {
        this.weightLimit = weightLimit;
        this.peopleInElevator = new Person[maxPerson];
        this.personLimit = maxPerson;
    }

    public void add(Person person) {
        if (peopleInElevator.length == this.peopleAdded) {
            System.out.println("Max amount of people in elevator exceeded");
        }
        if (peopleInElevator.length  != this.peopleAdded) {
            for (int i = 0; i < peopleInElevator.length; i++) {
                if (peopleInElevator[i] == null) {
                    peopleInElevator[i] = person;
                    break;
                }
            }
            this.peopleAdded++;
        }
    }

    public String start() throws InterruptedException {
        int loadedElevatorWeight = getLoadedElevatorWeight();
        System.out.println("loaded: " + loadedElevatorWeight);

        if (loadedElevatorWeight > this.weightLimit) {
            System.out.println("weight exceeded");
            return "Weight exceeded";
        }

        return this.handleElevatorState();
    }

    private int getLoadedElevatorWeight() {
        int sumOfWeight = 0;
        for (Person person : peopleInElevator) {
            if (person != null) {
                System.out.println(person.getWeight());
                sumOfWeight += person.getWeight();
            }
        }
        return sumOfWeight;
    }

    private String handleElevatorState() {
        try {
            System.out.println("Elevator starting!");
            Thread.sleep(4500);
            System.out.println("Elevator stopped!");
            this.clear();
            return "Elevator ready";
        } catch (InterruptedException e ){
            System.out.println("Sleep interrupted");
            this.clear();
            return "";
        }
    }

    private void clear() {
        this.peopleAdded = 0;
        this.peopleInElevator = new Person[personLimit];
    }

    public void getArrInfo() {
        for(Person person1 : peopleInElevator) {
            System.out.println(person1.getId());
        }
    }

}
