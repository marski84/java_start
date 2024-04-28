package EmployeeManagment.models;

public class FullTimeEmployee extends Employee  {

    private final double BONUS_MODIFIER;
    private double monthlySalary;

    public FullTimeEmployee(String firstName, String lastName, double monthlySalary, double bonusModifier) {
        super(firstName, lastName);
        this.BONUS_MODIFIER = bonusModifier;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double getMonthlySalary() {
        return monthlySalary;
    }

    @Override
    public double getYearlySalary() {
        double yearlySalary = monthlySalary * NO_OF_MONTHS;
        return yearlySalary * (1 + BONUS_MODIFIER);
    }
}
