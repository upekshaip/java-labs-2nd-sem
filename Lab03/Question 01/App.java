import src.TestClass;

public class App {
    public static void main(String[] args) {
        var tc = new TestClass("John Doe", 50, 100000);

        System.out.println("Name: " + tc.getName());
        System.out.println("Age: " + tc.getAge());
        System.out.println("Salary: " + tc.getSalary());
    }
}