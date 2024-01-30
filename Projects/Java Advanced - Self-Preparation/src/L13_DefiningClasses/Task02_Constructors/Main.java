package L13_DefiningClasses.Task02_Constructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Car> carsCollection = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] carInputData = scanner.nextLine().split("\\s+");
            String brand = carInputData[0];
            Car car;
            if (carInputData.length > 1) {
                String model = carInputData[1];
                int horsePower = Integer.parseInt(carInputData[2]);
                car = new Car(brand, model, horsePower);
                carsCollection.add(car);
            } else {
                car = new Car(brand);
                carsCollection.add(car);
            }
        }
        for (Car car : carsCollection) {
            System.out.println(car.carInfo());
        }
    }
}
