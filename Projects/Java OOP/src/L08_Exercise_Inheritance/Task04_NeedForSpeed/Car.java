package L08_Exercise_Inheritance.Task04_NeedForSpeed;

public class Car extends Vehicle{
    private static final double DEFAULT_FUEL_CONSUMPTION = 3;
    public Car(double fuel, int horsePower) {
        super(fuel, horsePower);
        this.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
