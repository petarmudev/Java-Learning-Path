package L12_Exercise_Polymorphism.Tasks01_02_Vehicles.vehicles;

public class Truck extends Vehicle {
    private static final double ADDITIONAL_AC_CONSUMPTION = 1.6;
    private static final double FUEL_LEAK_CORRECTION = 0.95;

    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + ADDITIONAL_AC_CONSUMPTION, tankCapacity);

    }

    @Override
    public void refuel(double liters) {
        liters = liters * FUEL_LEAK_CORRECTION;
        super.refuel(liters);
    }
}
