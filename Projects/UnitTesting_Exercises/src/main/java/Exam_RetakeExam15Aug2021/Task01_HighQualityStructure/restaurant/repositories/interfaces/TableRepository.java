package Exam_RetakeExam15Aug2021.Task01_HighQualityStructure.restaurant.repositories.interfaces;

public interface TableRepository<T> extends Repository<T> {
    T byNumber(int number);
}
