import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the dividend: ");
        int dividend = scan.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scan.nextInt();

        try {
            int quotient = divide(dividend, divisor);
            System.out.println("Quotient: " + quotient);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        scan.close();
    }

    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return dividend / divisor;

    }
}