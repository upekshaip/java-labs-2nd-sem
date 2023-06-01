package src;

public class InterfaceImplemented implements MyFirstInterface {
    public static void run() {
        InterfaceImplemented obj = new InterfaceImplemented();
        obj.display();
    }

    @Override
    public void display() {
        // Trying to change the value of x - Cannot assign value of x
        // x = 20; // This will result in a compile-time error
        System.out.println("Value of x: " + x);
    }
}
