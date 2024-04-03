package Exam_RetakeExam15Aug2021.Task01_HighQualityStructure.restaurant.entities.tables.interfaces;

import Exam_RetakeExam15Aug2021.Task01_HighQualityStructure.restaurant.entities.drinks.interfaces.Beverages;
import Exam_RetakeExam15Aug2021.Task01_HighQualityStructure.restaurant.entities.healthyFoods.interfaces.HealthyFood;

public interface Table {
    int getTableNumber();

    int getSize();

    int numberOfPeople();

    double pricePerPerson();

    boolean isReservedTable();

    double allPeople();

    void reserve(int numberOfPeople);

    void orderHealthy(HealthyFood food);

    void orderBeverages(Beverages beverages);

    double bill();

    void clear();

    String tableInformation();
}
