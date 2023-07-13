import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try {
            File file = new File("file.txt"); // Replace with the actual file path if needed
            Scanner scanner = new Scanner(file);

            // Read the file content (just an example)
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: The file was not found.");
        }
    }
}
