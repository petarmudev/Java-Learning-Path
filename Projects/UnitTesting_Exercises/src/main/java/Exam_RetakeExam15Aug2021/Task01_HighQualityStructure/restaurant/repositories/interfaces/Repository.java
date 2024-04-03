package Exam_RetakeExam15Aug2021.Task01_HighQualityStructure.restaurant.repositories.interfaces;

import java.util.Collection;

public interface Repository<T> {

    Collection<T> getAllEntities();

    void add(T entity);

}
