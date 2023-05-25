package src;

public class TestClass {
    public static void test() {
        // Create a Student object
        Student student = new Student();
        student.setName("John Doe");
        student.setID(12345);
        student.setCourse("Computer Science");

        // Create a Lecturer object
        Lecturer lecturer = new Lecturer();
        lecturer.setName("Jane Smith");
        lecturer.setID(67890);
        lecturer.setProgramme("Software Engineering");

        // Print student and lecturer information
        System.out.println("Student: " + student.getName() + " (ID: " +
                student.getID() + ")");
        System.out.println("Course: " + student.getCourse());
        System.out.println();
        System.out.println("Lecturer: " + lecturer.getName() + " (ID: " +
                lecturer.getID() + ")");
        System.out.println("Programme: " + lecturer.getProgramme());
    }
}
