package L23_ExerciseObjectsAndClasses.Task03_OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> peopleList = new ArrayList<>(); //списък с хората
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String personalData = scanner.nextLine();  //"Peter 12"
            String name = personalData.split(" ")[0];
            int age =Integer.parseInt(personalData.split(" ")[1]);

            //Проверка за възразстта по условието
            if (age > 30) {
                Person person = new Person(name, age);
                peopleList.add(person);
            }
        }
        for (Person person : peopleList) {
            System.out.println(person.getName() + " - " + person.getAge());
        }



    }
}
