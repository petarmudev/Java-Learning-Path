package L14_ExerciseDefiningClasses.Task02_CompanyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //https://softuni.bg/trainings/resources/video/68580/video-28-january-2022-desislava-topuzakova-java-advanced-january-2022/3586
        //Дълга е и започва от: 58:29ч. , до...май... си... - 2:10:00ч.
        // 1:48:03

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Employee>> departmentsList = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] inputData = scanner.nextLine().split("\\s+");
            String name = inputData[0];
            double salary = Double.parseDouble(inputData[1]);
            String position = inputData[2];
            String department = inputData[3];
            Employee employee = null;
            if (inputData.length == 6) {
                String email = inputData[4];
                int age = Integer.parseInt(inputData[5]);
                employee = new Employee(name, salary, position, department, email, age);
            } else if (inputData.length == 4) {
                employee = new Employee(name, salary, position, department);

            } else if (inputData.length == 5) {
                String forthParameter = inputData[4];
                if (forthParameter.contains("@")) {
                    String email = forthParameter;
                    employee = new Employee(name, salary, position, department, email);

                } else {
                    int age = Integer.parseInt(forthParameter);
                    employee = new Employee(name, salary, position, department, age);
                }
            }
            if (!departmentsList.containsKey(department)) {
                departmentsList.put(department, new ArrayList<>());
                departmentsList.get(department).add(employee);
            } else {
                departmentsList.get(department).add(employee);
            }
        }
        //Department -> List<Employee> employee
        //отдел -> average salary

        String maxAverageSalaryDepartment = departmentsList.entrySet().stream()
                .max(Comparator.comparingDouble(entry -> getAverageSalary(entry.getValue())))
                .get() //От Optional на горния ред го "превръщам" в entry<K, V> - списък със служителите на отдела с най-висока заплата
                .getKey(); //От тук получава името на отдела с най-висока заплата
        System.out.printf("Highest Average Salary: %s%n", maxAverageSalaryDepartment);
        List<Employee> employeeList = departmentsList.get(maxAverageSalaryDepartment);
        employeeList.sort(Comparator.comparingDouble(employee -> employee.getSalary()));
        Collections.reverse(employeeList);

        //departmentsList.get(max)
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    public static double getAverageSalary(List<Employee> employees) {
        double sumSalary = 0;

        for (Employee employee : employees) {
            sumSalary += employee.getSalary();
        }
        return sumSalary / employees.size();
    }
}
