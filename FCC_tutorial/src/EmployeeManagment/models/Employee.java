package EmployeeManagment.models;

public abstract class Employee  {
    final int NO_OF_MONTHS = 12;
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public abstract double getMonthlySalary();

    public abstract double getYearlySalary();
}
