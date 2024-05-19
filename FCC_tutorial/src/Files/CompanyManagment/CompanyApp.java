package Files.CompanyManagment;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CompanyApp {
  private final String FILENAME = "companyData.txt";
  private File file = new File(FILENAME);
  private Company company = new Company();
  private DataReader dataReader = new DataReader();

  public void getEmployeeData() {
    if (file.exists()) {
      try {
        file.createNewFile();
        System.out.println("okok");
        while (company.getAmountOfEmployees() != company.getMAX_EMPLOYEES()) {
          try{
            Employee employee = registerEmployee();
            company.addEmployee(employee);
          } catch (Exception e) {
            System.out.println(e);
          }
        }
      } catch (IOException e) {
        System.out.println(e);
      }

      System.out.println();


    }


  }

  public Employee registerEmployee() {
    try {
      System.out.println("Employee name:");
      String firstName = dataReader.getValidStringInput();
      System.out.println("Employee lastname:");
      String lastname = dataReader.getValidStringInput();
      System.out.println("Employee salary:");
      double salary = dataReader.getValidDoubleInput();

      System.out.println(firstName);
      System.out.println(lastname);
      System.out.println(salary);

      Employee newEmployee = new Employee(firstName, lastname, salary);
      System.out.println(newEmployee.getLastName());
      return newEmployee;

    } catch (InputMismatchException e) {
      throw e;
    }
  }

  private void getCompanyDataFromFile() {}

  private void saveCompanyDataToFile() {

  }


}
