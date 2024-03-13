package L12_Exercise_Polymorphism.Tasks01_02_Vehicles.vehicles;

import java.text.DecimalFormat;

public class Vehicle {

    private double fuelQuantity;
    private double fuelConsumption;
    private double tankCapacity;

    public Vehicle(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
        setTankCapacity(tankCapacity);
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }


    public String drive(double distance) {
        double fuelNeeded = distance * fuelConsumption;

        if (fuelNeeded > this.fuelQuantity) {
            //todo print need fuel
            //This:
            // return String.format("%s needs refueling", this.getClass().getSimpleName());     //Or:
            //Car or Truck??
            if (this instanceof Car) {
                return "Car needs refueling";
            } else if (this instanceof Truck) {
                return "Truck needs refueling";
            } else {
                return "Bus needs refueling";
            }
        } else {    //have enough fuel
            this.fuelQuantity = this.fuelQuantity - fuelNeeded;
            DecimalFormat df = new DecimalFormat("##.##");
            //This way:
            return String.format("%s travelled %s km", this.getClass().getSimpleName(), df.format(distance));
        }
    }

    public void refuel(double liters) {
        if (liters <= 0) {
            System.out.println("Fuel must be a positive number");
            return;
        }
        //todo check for errors in judge
        if (liters > this.tankCapacity - this.fuelQuantity) {
            System.out.println("Cannot fit fuel in tank");
            return;
        }
        this.fuelQuantity += liters;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.getFuelQuantity());
    }
}



