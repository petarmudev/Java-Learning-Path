package L23_ExerciseObjectsAndClasses.Task05_VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vehicle> vehicleList = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            //input = "truck Man red 200"
            if (input.equals("End")) {
                break;
            }
            String[] inputData = input.split(" ");
            String type = inputData[0];
            String model = inputData[1];
            String color = inputData[2];
            int hp = Integer.parseInt(inputData[3]);

            Vehicle vehicle = new Vehicle(type, model, color, hp);
            vehicleList.add(vehicle);
        }
        while (true) {
            String enteredModel = scanner.nextLine();
            if (enteredModel.equals("Close the Catalogue")) {
                //todo print the last summary
                break;
            }
            for (Vehicle vehicle : vehicleList) {
                if (enteredModel.equals(vehicle.getModel())) {
                    System.out.println(vehicle);
                    break;
                }
            }
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", getAverageHP(vehicleList, "car"));
        System.out.printf("Trucks have average horsepower of: %.2f.", getAverageHP(vehicleList, "truck"));
    }

    private static double getAverageHP(List<Vehicle> vehicleList, String type) {
        double sum = 0;
        int count = 0;
        if (type.equals("car")) {
            for (Vehicle vehicle : vehicleList) {
                if (vehicle.getType().equals("car")) {
                    sum += vehicle.getHp();
                    count++;
                }
            }
        } else if (type.equals("truck")) {
            for (Vehicle vehicle : vehicleList) {
                if (vehicle.getType().equals("truck")) {
                    sum += vehicle.getHp();
                    count++;
                }
            }
        }
        if (sum == 0){
            return 0;
        }
        return sum / count;
    }
}
