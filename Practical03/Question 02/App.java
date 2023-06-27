import src.Employee;

public class App {
    public static void main(String[] args) {
        var emp1 = new Employee("John Doe", 50000, 10000);

        System.out.println("Name: " + emp1.getName());
        System.out.println("Basic Salary: " + emp1.getBasic_salary());
        System.out.println("Bonus: " + emp1.getBonus());
        System.out.println("Bonus Amount: " + emp1.getBonus_amount());
    }
}