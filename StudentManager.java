import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> studentList;

    public StudentManager() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public boolean deleteStudent(int rollNum) {
        for (Student s : studentList) {
            if (s.getRollNumber() == rollNum) {
                studentList.remove(s);
                return true;
            }
        }
        return false;
    }

    public Student searchStudent(int rollNum) {
        for (Student s : studentList) {
            if (s.getRollNumber() == rollNum) {
                return s;
            }
        }
        return null;
    }

    public boolean updateStudent(int rollNum, Student updated) {
        for (Student s : studentList) {
            if (s.getRollNumber() == rollNum) {
                s.updateName(updated.getName());
                s.updateMarks(updated.getMarks());
                return true;
            }
        }
        return false;
    }

    public Student getTopper() {
        if (studentList.isEmpty()) {
            System.out.println("No Students Found!!");
            return null;
        }

        Student topper = studentList.get(0);
        int highestAverage = topper.getAverage();

        for (Student s : studentList) {
            if (s.getAverage() > highestAverage) {
                highestAverage = s.getAverage();
                topper = s;
            }

        }
        return topper;
    }

    public void displayAll() {
        if (studentList.isEmpty()) {
            System.out.println("No Students Found!!");
            return;
        }

        for (Student s : studentList) {
            System.out.println(s.toString());
        }
    }

    public ArrayList<Student> getAllStudents() {
        return studentList;
    }
}
