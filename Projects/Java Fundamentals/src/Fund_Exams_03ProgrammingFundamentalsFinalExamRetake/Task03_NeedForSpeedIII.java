package Fund_Exams_03ProgrammingFundamentalsFinalExamRetake;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task03_NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCars = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, Integer> carsMileage = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> carsFuel = new LinkedHashMap<>();

        for (int i = 0; i < numberOfCars; i++) {
            // "{car}|{mileage}|{fuel}"
            String input = scanner.nextLine();
            String[] inputParts = input.split("\\|");
            String car = inputParts[0];
            int mileage = Integer.parseInt(inputParts[1]);
            int fuel = Integer.parseInt(inputParts[2]);

            carsMileage.putIfAbsent(car, mileage);
            carsFuel.putIfAbsent(car, fuel);
        }

        while (true) {
            String input = scanner.nextLine();  //"Drive : {car} : {distance} : {fuel}"
            if (input.equals("Stop")) {
                break;
            }
            String[] commandParts = input.split("\\s:\\s");
            String command = commandParts[0];
            String car = commandParts[1];

            switch (command) {
                case "Drive":
                    int distance = Integer.parseInt(commandParts[2]);
                    int fuelNeeded = Integer.parseInt(commandParts[3]);
                    int currentMileage = carsMileage.get(car);
                    int currentFuel = carsFuel.get(car);

                    if (currentFuel < fuelNeeded) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        carsMileage.put(car, currentMileage + distance);
                        carsFuel.put(car, currentFuel - fuelNeeded);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, distance, fuelNeeded);
                    }
                    if (carsMileage.get(car) >= 100000) {
                        carsMileage.remove(car);
                        carsFuel.remove(car);
                        System.out.printf("Time to sell the %s!%n", car);
                    }
                    break;

                case "Refuel":  //"Refuel : {car} : {fuel}"
                    //maximum of 75 liters of fuel
                    int fuelToFill = Integer.parseInt(commandParts[2]);
                    currentFuel = carsFuel.get(car);
                    if ((currentFuel + fuelToFill) <= 75) {
                        carsFuel.put(car, currentFuel + fuelToFill);
                        System.out.printf("%s refueled with %d liters%n", car, fuelToFill);
                    } else {
                        carsFuel.put(car, 75);
                        System.out.printf("%s refueled with %d liters%n", car, (75 - currentFuel));
                    }
                    break;
                case "Revert":  //"Revert : {car} : {kilometers}"
                    currentMileage = carsMileage.get(car);
                    distance = Integer.parseInt(commandParts[2]);

                    if (((currentMileage - distance) < 10000)) {
                        carsMileage.put(car, 10000);
                    } else {
                        carsMileage.put(car, (currentMileage - distance));
                        System.out.printf("%s mileage decreased by %d kilometers%n", car, distance);
                    }
                    break;
                default:
                    break;
            }
        }
        //On "Stop" print:
        //     "{car} -> Mileage: {mileage} kms, Fuel in the tank: {fuel} lt."

        carsMileage.entrySet().forEach(car -> {
            String carName = car.getKey();
            int mileage = car.getValue();
            int fuel = carsFuel.get(carName);
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", carName, mileage, fuel);
        });
    }
}
