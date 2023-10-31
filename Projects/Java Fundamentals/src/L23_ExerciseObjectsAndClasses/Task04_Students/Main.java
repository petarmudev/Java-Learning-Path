package L23_ExerciseObjectsAndClasses.Task04_Students;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countStudents = Integer.parseInt(scanner.nextLine()); //number of students
        List<Student> studentList = new ArrayList<>(); //празен списък за съхранение на студентите
        for (int i = 0; i < countStudents; i++) {
            String studentsInfo = scanner.nextLine();
            String firstName = studentsInfo.split(" ")[0]; //първо име
            String lastName = studentsInfo.split(" ")[1];  //фамилия
            double grade = Double.parseDouble(studentsInfo.split(" ")[2]); //оценка

            Student student = new Student(firstName, lastName, grade);
            studentList.add(student);
        }
        //списък със студенти.
        //1. Сортиране на списъка(от обекти) по условие - descending order:

        Collections.sort(studentList, Comparator.comparingDouble(Student::getGrade)  //default : ascending order
                .reversed()); // descending order

        //2. Принтиране на сортирания списък:

        for (Student student : studentList) {
            System.out.printf("%s %s: %.2f%n", student.getFirstName(), student.getLastName(), student.getGrade());
        }
    }
}
