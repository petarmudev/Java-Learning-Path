package L14_ExerciseDefiningClasses.Task04_RawData;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Car>> carsTypeMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            //"{Model} {EngineSpeed} {EnginePower} {CargoWeight} {CargoType}
            // {Tire1Pressure} {Tire1Age} {Tire2Pressure} {Tire2Age} {Tire3Pressure} {Tire3Age} {Tire4Pressure} {Tire4Age}"
            String modelName = input[0];
            int engineSpeed = Integer.parseInt(input[1]);
            int enginePower = Integer.parseInt(input[2]);
            int cargoWeight = Integer.parseInt(input[3]);
            String cargoType = input[4];

            Engine engine = new Engine(engineSpeed, enginePower);
            Cargo cargo = new Cargo(cargoWeight, cargoType);
            List<Tire> tireList = new ArrayList<>();
            for (int tireData = 5; tireData <= 12; tireData += 2) {
                Tire currentTire = new Tire(Double.parseDouble(input[tireData]), Integer.parseInt(input[tireData + 1]));
                tireList.add(currentTire);
            }
            Car currentCar = new Car(modelName, engine, cargo, tireList);
            carsTypeMap.putIfAbsent(cargoType, new ArrayList<>());
            carsTypeMap.get(cargoType).add(currentCar);
        }

        //The rest of the logic
        //Print by the command
        String command = scanner.nextLine();
        carsTypeMap.get(command).forEach(car -> car.extract(command));
    }
}
