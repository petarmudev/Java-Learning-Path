package Exam_RetakeExam15Aug2021.Task01_HighQualityStructure.restaurant.entities.tables;

import Exam_RetakeExam15Aug2021.Task01_HighQualityStructure.restaurant.common.ExceptionMessages;
import Exam_RetakeExam15Aug2021.Task01_HighQualityStructure.restaurant.entities.drinks.interfaces.Beverages;
import Exam_RetakeExam15Aug2021.Task01_HighQualityStructure.restaurant.entities.healthyFoods.interfaces.HealthyFood;
import Exam_RetakeExam15Aug2021.Task01_HighQualityStructure.restaurant.entities.tables.interfaces.Table;

import java.util.ArrayList;
import java.util.Collection;

public class BaseTable implements Table {
    private Collection<HealthyFood> healthyFood;
    private Collection<Beverages> beverages;
    private int number;
    private int size;
    private int numberOfPeople;
    private double pricePerPerson;
    private boolean isReservedTable;
    private double allPeople;

    protected BaseTable(int number, int size, double pricePerPerson) {
        this.healthyFood = new ArrayList<>();
        this.beverages = new ArrayList<>();
        this.number = number;
        this.setSize(size);
        this.pricePerPerson = pricePerPerson;
    }

    public void setSize(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException(ExceptionMessages.INVALID_TABLE_SIZE);
        }
        this.size = size;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        if (numberOfPeople <= 0) {
            throw new IllegalArgumentException(ExceptionMessages.INVALID_NUMBER_OF_PEOPLE);
        }
        this.numberOfPeople = numberOfPeople;
    }

    @Override
    public int getTableNumber() {
        return this.number;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public int numberOfPeople() {
        return this.numberOfPeople;
    }

    @Override
    public double pricePerPerson() {
        return this.pricePerPerson;
    }

    @Override
    public boolean isReservedTable() {
        return isReservedTable;
    }

    @Override
    public double allPeople() {
        return this.allPeople;
    }

    @Override
    public void reserve(int numberOfPeople) {
        if (numberOfPeople <= 0) {
            throw new IllegalArgumentException(ExceptionMessages.INVALID_NUMBER_OF_PEOPLE);
        }
        this.numberOfPeople = numberOfPeople;
        this.isReservedTable = true;
    }

    @Override
    public void orderHealthy(HealthyFood food) {
        this.healthyFood.add(food);
    }

    @Override
    public void orderBeverages(Beverages beverages) {
        this.beverages.add(beverages);
    }

    @Override
    public double bill() {
        double bill = 0;
        bill += numberOfPeople * pricePerPerson;
        for (HealthyFood food : this.healthyFood) {
            bill += food.getPrice();
        }
        for (Beverages beverage : this.beverages) {
            bill += beverage.getPrice();
        }
        return bill;
    }

    @Override
    public void clear() {
        this.isReservedTable = false;
        this.beverages.clear();
        this.healthyFood.clear();
        this.numberOfPeople = 0;
    }

    @Override
    public String tableInformation() {
        StringBuilder info = new StringBuilder();
        info.append(String.format("Table - %d", this.number)).append(System.lineSeparator());
        info.append(String.format("Size - %d", this.size)).append(System.lineSeparator());
        info.append(String.format("Type - %s", this.getClass().getSimpleName())).append(System.lineSeparator());
        info.append(String.format("All price  - %.2f", this.pricePerPerson));
        return info.toString();
    }
}

