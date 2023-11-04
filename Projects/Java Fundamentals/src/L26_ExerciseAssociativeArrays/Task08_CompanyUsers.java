package L26_ExerciseAssociativeArrays;

import java.util.*;

public class Task08_CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> companyEmployees = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            // input= {companyname} -> {employeeId}
            String companyName = input.split(" -> ")[0];
            String employeeId = input.split(" -> ")[1];

            //1. Имаме такава компания
            if (companyEmployees.containsKey(companyName)) {
                //Проверяваме за вече съществуващ служител:

                List<String> currentEmployees = companyEmployees.get(companyName);
                if (!currentEmployees.contains(employeeId)) {
                    companyEmployees.get(companyName).add(employeeId);
                }
            }
            //2.Нямаме такава компания:
            else {
                companyEmployees.put(companyName, new ArrayList<>());
                companyEmployees.get(companyName).add(employeeId);
            }
            input = scanner.nextLine();
        }
        companyEmployees.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            entry.getValue().forEach(employee -> System.out.println("-- " + employee));
        });

    }
}
