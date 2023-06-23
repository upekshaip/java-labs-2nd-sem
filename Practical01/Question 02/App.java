import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        System.out.print("Enter your degree program: ");
        String degree = scan.nextLine();

        System.out.println("Your name is " + name);
        System.out.println("Your name is " + degree);
        scan.close();
    }
}