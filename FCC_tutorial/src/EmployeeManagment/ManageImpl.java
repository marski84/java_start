package EmployeeManagment;

import EmployeeManagment.exceptions.EmployeeListFullException;
import EmployeeManagment.logic.CompanyManagment;
import EmployeeManagment.models.FullTimeEmployee;
import EmployeeManagment.models.PartTimeEmployee;

public class ManageImpl {
    public static void main(String[] args) {
        CompanyManagment companyManagment = new CompanyManagment("testowa", 3);
        FullTimeEmployee first = new FullTimeEmployee("first", "first", 5000.00, 0.05);
        FullTimeEmployee second = new FullTimeEmployee("second", "second", 25000.00, 0.15);
        PartTimeEmployee third = new PartTimeEmployee("third", "third", 100 , 250);
        PartTimeEmployee fourth = new PartTimeEmployee("fourth", "fourth", 80 , 300);

        try{
            companyManagment.registerEmployee(first);
            companyManagment.registerEmployee(second);
            companyManagment.registerEmployee(third);
//           companyManagment.registerEmployee(fourth);
        } catch (EmployeeListFullException e) {
            System.out.println(e);
        }
        companyManagment.printCompanyData();
    }
}
