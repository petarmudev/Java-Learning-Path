package Exam_RetakeExam15Aug2021.Task01_HighQualityStructure.restaurant.repositories.interfaces;

public interface HealthFoodRepository<T> extends Repository<T> {
    T foodByName(String name);
}
