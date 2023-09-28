package session18.problem_6;

public class EmployeeService {

    private Employee employee;

    public EmployeeService(Employee employee){
       this.employee = employee;
    }

    public void giveRaise (double amount) {
        employee.setSalary(employee.getSalary()+amount);
    }

    public void deductTaxes(double taxPercentage) {
        System.out.println("Taxes own by employee " +
                employee.getName() + "amount to " +
                employee.getSalary() * taxPercentage/100);
    }

    public void printYearEarnings() {
        System.out.println("Yearly earnings for " + employee.getName() +
                " amount to $ " + employee.getSalary() * 12);
    }
}