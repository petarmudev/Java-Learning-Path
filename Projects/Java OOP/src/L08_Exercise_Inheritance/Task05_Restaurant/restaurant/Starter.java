package L08_Exercise_Inheritance.Task05_Restaurant.restaurant;

import java.math.BigDecimal;

public class Starter extends Food{
    public Starter(String name, BigDecimal price, double grams) {
        super(name, price, grams);
    }
}