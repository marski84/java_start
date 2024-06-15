package LambdaRef.exc2;

import lombok.Data;

@Data
public class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    private Employment employment;

    public Employee(String firstName, String lastName, double salary, Employment employment) {
        this.employment = employment;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
}
