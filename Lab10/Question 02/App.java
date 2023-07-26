import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        try {
            int index = 10;
            int element = numbers[index];
            System.out.println("Element at index " + index + ": " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
