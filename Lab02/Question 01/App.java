import src.Monster;

public class App {
    public static void main(String[] args) {
        Monster m = new Monster(50, "hello");
        System.out.println(m.getDescription());
        System.out.println(m.getLocation());

    }
}
