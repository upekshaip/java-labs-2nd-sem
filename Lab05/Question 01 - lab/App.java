import src.Employee;

public class App {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Bogdan", 1, "CEO");
        Employee emp2 = new Employee("Bird", 2, "Manager");

        print(emp1);
        print(emp2);
    }

    public static void print(Employee emp) {
        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Designation: " + emp.getEmpDesignation());
        System.out.println();
    }
}