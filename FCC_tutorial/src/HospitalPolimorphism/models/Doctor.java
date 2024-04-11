package HospitalPolimorphism.models;

public class Doctor extends Person {
    private double salaryBonus;

    public Doctor(String firstName, String lastName, double salary, double salaryBonus) {
        super(firstName, lastName, salary);
        this.salaryBonus = salaryBonus;
    }

    public double getSalaryBonus() {
        return salaryBonus;
    }

    public void setSalaryBonus(double salaryBonus) {
        this.salaryBonus = salaryBonus;
    }
}
