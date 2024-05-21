package Files.CompanyManagment;

import java.io.*;
import java.util.InputMismatchException;

public class CompanyApp {
  private final String FILENAME = "companyData.txt";
  private File file = new File(FILENAME);
  private Company company = new Company();
  private DataReader dataReader = new DataReader();

  public void init() throws IOException {
    if (!file.exists()) {
      createNewFileAndRegisterEmployees();
    } else {
      loadCompanyFromFile();
    }
  }

  private void loadCompanyFromFile() {
    company.setEmployees(getCompanyEmployeesDataFromFile());
    System.out.println(company.getEmployees()[0].getSalary());
  }

  private void createNewFileAndRegisterEmployees() throws IOException {
    file.createNewFile();
    while (company.getAmountOfEmployees() != company.getMAX_EMPLOYEES()) {
      try {
        Employee employee = registerEmployee();
        company.addEmployee(employee);
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
      saveEmployeeDataToFile(company.getEmployees());
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
      Employee newEmployee = new Employee(firstName, lastname, salary);
      System.out.println(newEmployee.getLastName());
      return newEmployee;

    } catch (InputMismatchException e) {
      throw e;
    }
  }

  private Employee[] getCompanyEmployeesDataFromFile() {
    Employee[] employee = null;
    try (var fis = new FileInputStream(FILENAME);
        var objectStream = new ObjectInputStream(fis)) {
      employee = (Employee[]) objectStream.readObject();
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
    return employee;
  }

  private void saveEmployeeDataToFile(Employee[] employeeData) {
    try (var fs = new FileOutputStream(FILENAME);
        var objectStream = new ObjectOutputStream(fs)) {
      objectStream.writeObject(employeeData);
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
