package src;

public class Run {
    public static void run() {

        Speaker politician = new Politician();
        Speaker priest = new Priest();
        Speaker lecturer = new Lecturer();

        System.out.println("=== Politician ===");
        politician.speak();

        System.out.println("=== Priest ===");
        priest.speak();

        System.out.println("=== Lecturer ===");
        lecturer.speak();
    }
}
