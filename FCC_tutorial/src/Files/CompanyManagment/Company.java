package Files.CompanyManagment;

public class Company {
    private final int MAX_EMPLOYEES = 3;
    private Employee[] employees = new Employee[MAX_EMPLOYEES];
    private int amountOfEmployees = 0;

    public void addEmployee(Employee employee) throws Exception {
        if (amountOfEmployees == MAX_EMPLOYEES) {
            throw new Exception("Max amount of employees addes");
        }

        employees[amountOfEmployees] = employee;
        amountOfEmployees++;
    }

    public int getAmountOfEmployees() {
        return amountOfEmployees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public int getMAX_EMPLOYEES() {
        return MAX_EMPLOYEES;
    }

    public Employee[] getEmployees() {
        return employees;
    }
}
