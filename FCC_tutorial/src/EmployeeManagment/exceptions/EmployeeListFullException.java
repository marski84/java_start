package EmployeeManagment.exceptions;

public class EmployeeListFullException extends Exception {
    public EmployeeListFullException() {
        System.out.println("Employee list is full!");
    }
}
