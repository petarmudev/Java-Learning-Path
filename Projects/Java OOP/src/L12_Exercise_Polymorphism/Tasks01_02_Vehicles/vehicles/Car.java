package L12_Exercise_Polymorphism.Tasks01_02_Vehicles.vehicles;

public class Car extends Vehicle {
    private static final double ADDITIONAL_AC_CONSUMPTION = 0.9;
    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + ADDITIONAL_AC_CONSUMPTION, tankCapacity);

    }
}