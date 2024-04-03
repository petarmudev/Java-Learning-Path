package Exam_RetakeExam15Aug2021.Task01_HighQualityStructure.restaurant.repositories;

import Exam_RetakeExam15Aug2021.Task01_HighQualityStructure.restaurant.entities.drinks.interfaces.Beverages;
import Exam_RetakeExam15Aug2021.Task01_HighQualityStructure.restaurant.repositories.interfaces.BeverageRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BeverageRepositoryImpl implements BeverageRepository<Beverages> {
    private Collection<Beverages> beverages;
    public BeverageRepositoryImpl() {
        this.beverages = new ArrayList<>();
    }
    @Override
    public Beverages beverageByName(String drinkName, String drinkBrand) {
        for (Beverages beverage : this.beverages) {
            if (beverage.getName().equals(drinkName) && beverage.getBrand().equals(drinkBrand)) {
                return beverage;
            }
        }
        return null;
    }

    @Override
    public Collection<Beverages> getAllEntities() {
        return Collections.unmodifiableCollection(beverages);
    }

    @Override
    public void add(Beverages entity) {
        this.beverages.add(entity);
    }
}
