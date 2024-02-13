package L21_ExamPrep_10Feb2022.Task03_CarDealership.dealership;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Dealership {
    private List<Car> data;
    private String name;
    private int capacity;

    public Dealership(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Car car) {
        if (this.data.size() < this.capacity) {
            this.data.add(car);
        }
    }

    public boolean buy(String manufacturer, String model) {

        for (Car car : this.data) {
            if (car.getManufacturer().equals(manufacturer) && car.getModel().equals(model)) {
                this.data.remove(car);
                return true;
            }
        }
        return false;
    }

    public Car getLatestCar() {
        if (this.data.isEmpty()) {
            return null;
        } else {
            return this.data.stream().max(Comparator.comparing(Car::getYear)).get();
        }
    }

    public int getCount() {
        return this.data.size();
    }

    public Car getCar(String manufacturer, String model) {

        for (Car car : this.data) {
            if (car.getManufacturer().equals(manufacturer) && car.getModel().equals(model)) {
                return car;
            }
        }
        return null;
    }

    public String getStatistics() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("The cars are in a car dealership %s:%n", this.name));
        for (Car car : this.data) {
            builder.append(car).append("\n");
        }
        return builder.toString();
    }
}
