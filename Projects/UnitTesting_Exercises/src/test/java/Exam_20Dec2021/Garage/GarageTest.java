package Exam_20Dec2021.Garage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class GarageTest {
    private Garage garage;
    @Before
    public void setup() {
        this.garage = new Garage();
    }

    //1. add
    //1.1 successful
    @Test
    public void testAddCarSuccessful() {
        Assert.assertEquals(0, this.garage.getCount());
        Car car = new Car("Skoda", 220, 65000);
        this.garage.addCar(car);
        //1. car
        Assert.assertEquals(1, this.garage.getCount());
    }
    //1.2 add null

    @Test (expected = IllegalArgumentException.class)
    public void testAddCarNullShouldThrow() {
        this.garage.addCar(null);
    }

    //2. findAllCarsByBrand
    @Test
    public void testFindAllCarsByBrand() {
        Car carBmwE46 = new Car("BMW", 200, 5000);
        Car carBmwE39 = new Car("BMW", 220, 15000);
        Car carBmwE60 = new Car("BMW", 240, 25000);
        Car carOpelCorsa = new Car("Opel", 180, 2000);
        this.garage.addCar(carBmwE46);
        this.garage.addCar(carBmwE39);
        this.garage.addCar(carBmwE60);
        this.garage.addCar(carOpelCorsa);

        List<Car> returnedCars = this.garage.findAllCarsByBrand("BMW");

        Assert.assertEquals(3, returnedCars.size());
        Assert.assertEquals(carBmwE46, returnedCars.get(0));
        Assert.assertEquals(carBmwE39, returnedCars.get(1));
        Assert.assertEquals(carBmwE60, returnedCars.get(2));

    }
    //3. findAllCarsWithMaxSpeedAbove
    @Test
    public void testFindAllCarsWithMaxSpeedAbove() {
        Car carBmwE46 = new Car("BMW", 210, 5000);
        Car carBmwE39 = new Car("BMW", 220, 15000);
        Car carBmwE60 = new Car("BMW", 240, 25000);
        Car carOpelCorsa = new Car("Opel", 180, 2000);
        this.garage.addCar(carBmwE46);
        this.garage.addCar(carBmwE39);
        this.garage.addCar(carBmwE60);
        this.garage.addCar(carOpelCorsa);

        List<Car> returnedCars = this.garage.findAllCarsWithMaxSpeedAbove(200);
        Assert.assertEquals(3, returnedCars.size());
        Assert.assertEquals(carBmwE46, returnedCars.get(0));
        Assert.assertEquals(carBmwE39, returnedCars.get(1));
        Assert.assertEquals(carBmwE60, returnedCars.get(2));
    }


    //4. getTheMostExpensiveCar
    @Test
    public void testGetTheMostExpensiveCar() {
        Car carBmwE46 = new Car("BMW", 210, 5000);
        Car carBmwE39 = new Car("BMW", 220, 15000);
        Car carBmwE60 = new Car("BMW", 240, 25000);
        Car carOpelCorsa = new Car("Opel", 180, 2000);
        this.garage.addCar(carBmwE46);
        this.garage.addCar(carBmwE39);
        this.garage.addCar(carBmwE60);
        this.garage.addCar(carOpelCorsa);
        Car mostExpensiveCar = this.garage.getTheMostExpensiveCar();
        Assert.assertEquals(carBmwE60, mostExpensiveCar);
    }

    

    //5. getCars
    @Test
    public void testGetCars() {
        Car carBmwE46 = new Car("BMW", 210, 5000);
        Car carBmwE39 = new Car("BMW", 220, 15000);
        Car carBmwE60 = new Car("BMW", 240, 25000);
        Car carOpelCorsa = new Car("Opel", 180, 2000);

        List<Car> addedCars = new ArrayList<>();

        this.garage.addCar(carBmwE46);
        this.garage.addCar(carBmwE39);
        this.garage.addCar(carBmwE60);
        this.garage.addCar(carOpelCorsa);
        addedCars.add(carBmwE46);
        addedCars.add(carBmwE39);
        addedCars.add(carBmwE60);
        addedCars.add(carOpelCorsa);
        List<Car> returnedCars = this.garage.getCars();
        Assert.assertEquals(addedCars, returnedCars);
    }

}