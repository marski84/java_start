package EmployeeManagment.models;

public class PartTimeEmployee extends Employee {

    private double rateOfPay;
    private double hoursWorked;


    public PartTimeEmployee(String firstName, String lastName, double rateOfPay, double hoursWorked) {
        super(firstName, lastName);
        this.rateOfPay = rateOfPay;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double getMonthlySalary() {
        return rateOfPay * hoursWorked;
    }

    @Override
    public double getYearlySalary() {
        return getMonthlySalary() * this.NO_OF_MONTHS;
    }
}
