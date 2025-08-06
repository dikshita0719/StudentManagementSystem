import java.util.HashMap;

public class Student {
    private String name;
    private final int rollNumber;
    private HashMap<String, Integer> marks;
    private String grade;

    public Student(String name, int rollNumber, HashMap<String, Integer> marks) {

        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException("Student name cannot be empty. or rollw number cannot be empty");
        }
        if (rollNumber <= 0) {
            throw new IllegalArgumentException("Roll number cannot be negative, zeroor empty");
        }

        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
        updateGrade();
    }

    public void updateName(String newName) {
        if (newName == null || newName.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        name = newName;
    }

    public void updateMarks(HashMap<String, Integer> newMarks) {
        if (newMarks == null || newMarks.isEmpty()) {
            throw new IllegalArgumentException("Marks cannot be null or empty.");
        }
        marks = newMarks;
        updateGrade();
    }

    public void updateGrade() {
        grade = getGradeString();
    }

    public int getAverage() {
        int totalMarks = 0;

        for (int mark : marks.values()) {
            totalMarks += mark;
        }

        return (int) Math.round(totalMarks / (double) marks.size());
    }

    public String getGradeString() {
        int average = getAverage();

        if (average >= 90)
            return "A+";
        else if (average >= 80)
            return "A";
        else if (average >= 70)
            return "B";
        else if (average >= 60)
            return "C";
        else if (average >= 50)
            return "D";
        else if (average >= 40)
            return "E";
        else
            return "F";
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public HashMap<String, Integer> getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return ("Student Name: " + name +
                "\nRoll Number: " + rollNumber +
                "\nMarks: " + marks +
                "\nGrade:" + grade);
    }
}
