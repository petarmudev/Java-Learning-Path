package L03_WorkingWithAbstraction.Task03_studentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> studentsList;

    public StudentSystem() {
        this.studentsList = new HashMap<>();
    }

    public Map<String, Student> getStudentsList() {
        return this.studentsList;
    }

    public void executeCommand(String[] commandParts) {
        String command = commandParts[0];
        switch (command) {
            case "Create":
                createStudent(commandParts);
            break;
            case "Show":
                showStudent(commandParts);
            break;
        }
    }

    private void showStudent(String[] commandParts) {
        String name = commandParts[1];
        if (studentsList.containsKey(name)) {
            Student student = studentsList.get(name);
            String studentInfo = student.toString();
            StringBuilder showStudentInfo = new StringBuilder(studentInfo);

            addStudentAssessment(student, showStudentInfo);
            System.out.println(showStudentInfo);
        }
    }

    private static void addStudentAssessment(Student student, StringBuilder showStudent) {
        if (student.getGrade() >= 5.00) {
            showStudent.append(" Excellent student.");
        } else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50) {
            showStudent.append(" Average student.");
        } else {
            showStudent.append(" Very nice person.");
        }
    }

    private void createStudent(String[] commandParts) {
        String name = commandParts[1];
        int age = Integer.parseInt(commandParts[2]);
        double grade = Double.parseDouble(commandParts[3]);

        Student student = new Student(name, age, grade);
        studentsList.putIfAbsent(name, student);
    }
}
