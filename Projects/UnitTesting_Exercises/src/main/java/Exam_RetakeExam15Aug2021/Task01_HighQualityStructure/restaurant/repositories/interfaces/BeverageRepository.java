package Exam_RetakeExam15Aug2021.Task01_HighQualityStructure.restaurant.repositories.interfaces;

public interface BeverageRepository<T> extends Repository<T> {
    T beverageByName(String drinkName,String drinkBrand);
}
