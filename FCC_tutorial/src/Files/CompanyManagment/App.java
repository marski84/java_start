package Files.CompanyManagment;

import java.io.IOException;

public class App {
  public static void main(String[] args) throws IOException {
//    Company newCompany = new Company();
//    Employee a = new Employee("a", "a", 5000.0);
//    Employee b = new Employee("b", "b", 9000.0);
//    Employee c = new Employee("c", "c", 3000.0);

    //        try{
    //            newCompany.addEmployee(a);
    //            newCompany.addEmployee(b);
    //            newCompany.addEmployee(c);
    //        } catch (Exception e) {
    //            System.out.println(e);
    //        }

    CompanyApp companyApp = new CompanyApp();
    companyApp.init();
  }
}
