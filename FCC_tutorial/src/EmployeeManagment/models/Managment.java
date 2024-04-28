package EmployeeManagment.models;

import EmployeeManagment.exceptions.EmployeeListFullException;

public interface Managment {
    void registerEmployee(Employee employee) throws EmployeeListFullException;
    double calculateMonthlyWages();
    double calculateYearlyWages();
    void printCompanyData();

}
