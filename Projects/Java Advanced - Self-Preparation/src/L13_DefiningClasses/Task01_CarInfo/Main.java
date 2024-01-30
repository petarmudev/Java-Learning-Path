package L13_DefiningClasses.Task01_CarInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Car car = new Car();
//        car.setBrand("Chevrolet");
//        car.setModel("Impala");
//        car.setHorsePower(390);
//        System.out.println(String.format("The car is: %s %s - %d HP.",
//                car.getBrand(), car.getModel(), car.getHorsePower()));

        int n = Integer.parseInt(scanner.nextLine());
        List<Car> carsCollection = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] cardata = scanner.nextLine().split("\\s+");
            String brand = cardata[0];
            String model = cardata[1];
            int horsePower = Integer.parseInt(cardata[2]);
            Car car = new Car();
            car.setBrand(brand);
            car.setModel(model);
            car.setHorsePower(horsePower);
            //car.friends.add("Peter");
            carsCollection.add(car);

        }
        for (Car car : carsCollection) {
            System.out.println(car.carInfo());
        }
    }
}
