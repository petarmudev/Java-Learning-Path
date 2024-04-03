package Exam_RetakeExam15Aug2021.Task01_HighQualityStructure.restaurant.repositories;

import Exam_RetakeExam15Aug2021.Task01_HighQualityStructure.restaurant.entities.healthyFoods.interfaces.HealthyFood;
import Exam_RetakeExam15Aug2021.Task01_HighQualityStructure.restaurant.repositories.interfaces.HealthFoodRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class HealthFoodRepositoryImpl implements HealthFoodRepository<HealthyFood> {
    private Collection<HealthyFood> healthyFoods;

    public HealthFoodRepositoryImpl() {
        this.healthyFoods = new ArrayList<>();
    }

    @Override
    public HealthyFood foodByName(String name) {
        for (HealthyFood food : this.healthyFoods) {
            if (food.getName().equals(name)) {
                return food;
            }
        }
        return null;
    }

    @Override
    public Collection<HealthyFood> getAllEntities() {
        return Collections.unmodifiableCollection(this.healthyFoods);
    }

    @Override
    public void add(HealthyFood entity) {
        this.healthyFoods.add(entity);
    }
}
