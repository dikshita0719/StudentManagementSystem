import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        // Create marks for student 1
        HashMap<String, Integer> marks1 = new HashMap<>();
        marks1.put("Math", 95);
        marks1.put("Physics", 90);
        marks1.put("Chemistry", 88);

        // Create marks for student 2
        HashMap<String, Integer> marks2 = new HashMap<>();
        marks2.put("Math", 75);
        marks2.put("Physics", 80);
        marks2.put("Chemistry", 70);

        // Create Student objects
        Student student1 = new Student("Alice", 1, marks1);
        Student student2 = new Student("Bob", 2, marks2);

        // Add students to manager
        manager.addStudent(student1);
        manager.addStudent(student2);

        // Display all students
        System.out.println("All Students:");
        manager.displayAll();

        // Search for a student
        System.out.println("\nSearching for roll number 1:");
        Student found = manager.searchStudent(1);
        System.out.println(found != null ? found : "Student not found");

        // Update student 2's name and marks
        HashMap<String, Integer> updatedMarks = new HashMap<>();
        updatedMarks.put("Math", 85);
        updatedMarks.put("Physics", 90);
        updatedMarks.put("Chemistry", 95);
        Student updatedStudent = new Student("Robert", 2, updatedMarks);

        boolean updated = manager.updateStudent(2, updatedStudent);
        System.out.println("\nUpdate student 2: " + (updated ? "Success" : "Failed"));

        // Display all students after update
        System.out.println("\nAll Students after update:");
        manager.displayAll();

        // Get topper
        System.out.println("\nTopper:");
        Student topper = manager.getTopper();
        System.out.println(topper != null ? topper : "No students found");

        // Delete student 1
        boolean deleted = manager.deleteStudent(1);
        System.out.println("\nDelete student 1: " + (deleted ? "Success" : "Failed"));

        // Display all students after deletion
        System.out.println("\nAll Students after deletion:");
        manager.displayAll();
    }
}