public class App {
    public static void main(String[] args) {
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'D':
                System.out.println("You passed");
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);
        // OUTPUT:
        // Excellent!
        // Your grade is A

        char grade_ = 'A';
        switch (grade_) {
            case 'A':
                System.out.println("Excellent!");
            case 'D':
                System.out.println("You passed");
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade_);
        // OUTPUT:
        // Excellent!
        // You passed
        // Better try again
        // Your grade is A

    }
}