package HospitalPolimorphism.models;

public class Hospital {
    private final int AMOUNT_OF_WORKERS = 1000;
    private int workersAdded = 0;
    Person[] employeeList = new Person[AMOUNT_OF_WORKERS];


    public Hospital() {}
    public Hospital(int workersAdded, Person[] employeeList) {
        this.workersAdded = workersAdded;
        this.employeeList = employeeList;
    }

    public void add(Person employee) {
        if (this.workersAdded == this.AMOUNT_OF_WORKERS) {
            System.out.println("Max number of workers already added");
            return;
        }
        this.employeeList[workersAdded] = employee;
        workersAdded++;
    }

    public void printHospitalWorkers() {
        for (Person employee : employeeList) {
            if (employee != null) {
                System.out.println(employee.getFirstName() + " " + employee.getLastName() + " " + employee.getSalary());
            }
        }

    }
}
