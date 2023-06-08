package src;

public interface MyFirstInterface {
    int x = 10;

    void display();

    // In this interface, we declare the variable "x" without explicitly specifying
    // the "public static final" keywords. However, in interfaces, all variables are
    // implicitly public, static, and final by default. So whether you explicitly
    // include these keywords or not, the result will be the same.

    // In summary, there is no difference between declaring the constant variable
    // with or without the "public static final" keywords in an interface. The
    // variables will always be treated as public, static, and final by default.

    // int x = 10;
    // public static final int x = 10;
    // Both are same...

    // ---------------------------------------------------------------------------------------

    // In Java, when declaring an abstract method within an interface, you do not
    // need to explicitly use the "abstract" keyword. All methods declared within an
    // interface are implicitly abstract by default.

    // In summary, whether you include the "abstract" keyword or not, interface
    // methods are always considered abstract. Using the "abstract" keyword in an
    // interface method declaration is optional, but it is common practice to omit
    // it since it is redundant and the method is abstract by default.

    // void display();
    // abstract void display();
    // Both are same...

    // ---------------------------------------------------------------------------------------
}
