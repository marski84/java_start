package EmployeeManagment.logic;

import EmployeeManagment.exceptions.EmployeeListFullException;
import EmployeeManagment.models.Employee;
import EmployeeManagment.models.Managment;

public class CompanyManagment implements Managment {
    private final String companyName;
    private final int MAX_EMPLOYEES_NUMBER;
    private final double NO_MONTHLY_WAGES = 0;
    private final int NO_EMPLOYEES_ADDED_INDEX = 0;
    private int employeesAdded = 0;


    private Employee[] employees;

    public CompanyManagment(String companyName, int numberOfEmployees) {
        this.companyName = companyName;
        this.MAX_EMPLOYEES_NUMBER = numberOfEmployees;
        employees = new Employee[numberOfEmployees];
    }

    @Override
    public void registerEmployee(Employee employee) throws EmployeeListFullException {
        int index = NO_EMPLOYEES_ADDED_INDEX;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                index = i;
            }
        }
        if (employeesAdded == MAX_EMPLOYEES_NUMBER) {
            throw new EmployeeListFullException();
        }
        employees[index] = employee;
        employeesAdded++;
    }

    @Override
    public double calculateMonthlyWages() {
        double monthlyWages = NO_MONTHLY_WAGES;
        for (Employee employee : employees) {
            monthlyWages += employee.getMonthlySalary();
        }

        return monthlyWages;
    }

    @Override
    public double calculateYearlyWages() {
        double yearlyWages = NO_MONTHLY_WAGES;
        for (Employee employee : employees) {
            yearlyWages += employee.getYearlySalary();
        }

        return yearlyWages;
    }

    @Override
    public void printCompanyData() {
        StringBuilder companyInfo = new StringBuilder();

        for (Employee employee : employees) {
            companyInfo.append(employee.getFirstName() + " " + employee.getLastName());
            companyInfo.append(" wypłata miesięczna: " + employee.getMonthlySalary());
            companyInfo.append(" ,wypłata roczna: " + employee.getYearlySalary());
            companyInfo.append('\n');
        }

        companyInfo.append("Suma miesięcznych wynagrodzeń: " + calculateMonthlyWages());
        companyInfo.append('\n');
        companyInfo.append("Suma rocznych wynagrodzeń: " + calculateYearlyWages());

        System.out.println(companyInfo);
    }
}
