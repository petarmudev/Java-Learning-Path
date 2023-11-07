package L26_ExerciseAssociativeArrays;

import java.rmi.MarshalledObject;
import java.util.*;

public class Task05_Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> courses = new LinkedHashMap<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            String courseName = input.split(" : ")[0];
            String studentsName = input.split(" : ")[1];

            //1.Проверяваме дали имаме такъв курс
            //1.1. Имаме такъв курс

            if (courses.containsKey(courseName)) {
                List<String> currentCourses = courses.get(courseName);

                //1.1.1 Нямамe дублиране на студент

                if (!currentCourses.contains(studentsName)) {
                    courses.get(courseName).add(studentsName);

                }//1.1.2 Имаме такъв студент
                else {
                    //todo
                }

            } else {
                //1.2 Нямаме такъв курс:
                courses.putIfAbsent(courseName, new ArrayList<>());
                courses.get(courseName).add(studentsName);
            }

            //courses.get(courseName).add(studentsName);

        }
        //2.Принтиране по условие:
//        Print information about each course, following the format:
//        "{courseName}: {registeredStudents}"
//        Print information about each student, following the format:
//        "-- {studentName}"

        courses.entrySet().forEach(entry -> {
            List<String> studentsCount = courses.get(entry.getKey());
            System.out.printf("%s: %d%n", entry.getKey(), studentsCount.size());
            entry.getValue().forEach(student -> System.out.printf("-- %s%n", student));
        });

    }
}
