public class App {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };
        for (int x : numbers) {
            if (x == 30) {
                break;
            }
            System.out.print(x);
            System.out.print("\n");
        }
        System.out.println("I'm out of the Loop now");
        // OUTPUT: 10 20 I'm out of the Loop now

        // method 2
        int[] numbers_ = { 10, 20, 30, 40, 50 };
        for (int x : numbers_) {
            if (x == 30) {
                continue;
            }
            System.out.print(x);
            System.out.print("\n");
        }
        System.out.print("I'm out of the Loop now");
        // OUTPUT: 10 20 40 50 I'm out of the Loop now

    }
}