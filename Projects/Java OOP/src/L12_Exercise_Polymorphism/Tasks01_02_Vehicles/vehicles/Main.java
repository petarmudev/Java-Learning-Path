package L12_Exercise_Polymorphism.Tasks01_02_Vehicles.vehicles;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split("\\s+");
        Vehicle car = createVehicle(tokens);

        tokens = scanner.nextLine().split("\\s+");
        Vehicle truck = createVehicle(tokens);

        tokens = scanner.nextLine().split("\\s+");
        Vehicle bus = createVehicle(tokens);

        Map<String, Vehicle> vehicles = new LinkedHashMap<>();
        vehicles.put("Car", car);
        vehicles.put("Truck", truck);
        vehicles.put("Bus", bus);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfCommands; i++) {
            tokens = scanner.nextLine().split("\\s+");
            String command = tokens[0];
            String vehicleType = tokens[1];
            switch (command) {
                case "Drive":
                    double distance = Double.parseDouble(tokens[2]);
                    Vehicle currentVehicle = vehicles.get(vehicleType);
                    if (currentVehicle instanceof Bus && bus!= null) {
                        bus.setFuelConsumption(bus.getFuelConsumption() + Bus.ADDITIONAL_AC_CONSUMPTION); //increase cons because driving full
                        System.out.println(bus.drive(distance));
                        bus.setFuelConsumption(bus.getFuelConsumption() - Bus.ADDITIONAL_AC_CONSUMPTION); //return previous state
                        continue;
                    }
                    System.out.println(vehicles.get(vehicleType).drive(distance));
                    break;
                case "DriveEmpty":
                    double distanceEmpty = Double.parseDouble(tokens[2]);
                    System.out.println(vehicles.get(vehicleType).drive(distanceEmpty));
                    break;

                case "Refuel":
                    double liters = Double.parseDouble(tokens[2]);
                    vehicles.get(vehicleType).refuel(liters);
                    break;
            }
        }
        vehicles.values().forEach(System.out::println);
    }

    private static Vehicle createVehicle(String[] tokens) {
        String vehicleType = tokens[0];
        double fuelQuantity = Double.parseDouble(tokens[1]);
        double fuelConsumption = Double.parseDouble(tokens[2]);
        double tankCapacity = Double.parseDouble(tokens[3]);
        if (vehicleType.equals("Car")) {
            return new Car(fuelQuantity, fuelConsumption, tankCapacity);
        } else if (vehicleType.equals("Truck")) {
            return new Truck(fuelQuantity, fuelConsumption, tankCapacity);
        } else if (vehicleType.equals("Bus")) {
            return new Bus(fuelQuantity, fuelConsumption, tankCapacity);
        } else {
            return null;
        }
    }
}
