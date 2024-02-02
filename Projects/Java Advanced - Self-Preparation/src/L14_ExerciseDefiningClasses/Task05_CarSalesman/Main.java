package L14_ExerciseDefiningClasses.Task05_CarSalesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Car>> carsList = new LinkedHashMap<>();

        List<Engine> engines = new ArrayList<>();
        int enginesNumber = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < enginesNumber; i++) {
            // "{Model} {Power} {Displacement} {Efficiency}"
            String[] engineData = scanner.nextLine().split("\\s+");
            //Required:
            String model = engineData[0];
            int power = Integer.parseInt(engineData[1]);
            //Optional
            int displacement = 0;
            String efficiency = null;

            //Optional data check:
            if (engineData.length == 4) {
                displacement = Integer.parseInt(engineData[2]);
                efficiency = engineData[3];
            } else if (engineData.length == 3) {
                if (Character.isDigit(engineData[2].charAt(0))) {
                    displacement = Integer.parseInt(engineData[2]);
                } else {
                    efficiency = engineData[2];
                }
            }
            Engine engine = new Engine(model, power, displacement, efficiency);
            engines.add(engine);
        }
        System.out.println();
        int carsNumber = Integer.parseInt(scanner.nextLine());
        for (int j = 0; j < carsNumber; j++) {
            String[] inputData = scanner.nextLine().split("\\s+");
            //Required
            String carModel = inputData[0];
            String engineModel = inputData[1];
            //Optional
            int weight = 0;
            String color = null;

            if (inputData.length == 4) {
                weight = Integer.parseInt(inputData[2]);
                color = inputData[3];
            } else if (inputData.length == 3) {
                if (Character.isDigit(inputData[2].charAt(0))) {
                    weight = Integer.parseInt(inputData[2]);
                } else {
                    color = inputData[2];
                }
            }
            Engine carEngine = null;
            for (Engine engine : engines) {
                if (engineModel.equals(engine.getModel())) {
                    carEngine = engine;
                    break;
                }
            }

            Car car = new Car(carModel, carEngine, weight, color);
            System.out.print(car.toString());
        }
    }
}
