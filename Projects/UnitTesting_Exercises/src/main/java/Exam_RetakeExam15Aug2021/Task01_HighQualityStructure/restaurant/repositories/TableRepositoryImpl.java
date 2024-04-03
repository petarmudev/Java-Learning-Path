package Exam_RetakeExam15Aug2021.Task01_HighQualityStructure.restaurant.repositories;

import Exam_RetakeExam15Aug2021.Task01_HighQualityStructure.restaurant.entities.tables.interfaces.Table;
import Exam_RetakeExam15Aug2021.Task01_HighQualityStructure.restaurant.repositories.interfaces.TableRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TableRepositoryImpl implements TableRepository<Table> {
    private Collection<Table> tables;

    public TableRepositoryImpl() {
        this.tables = new ArrayList<>();
    }

    @Override
    public Collection<Table> getAllEntities() {
        return Collections.unmodifiableCollection(this.tables);
    }

    @Override
    public void add(Table entity) {
        this.tables.add(entity);
    }

    @Override
    public Table byNumber(int number) {
        for (Table table :this.tables) {
            if (table.getTableNumber() == number) {
                return table;
            }
        }
        return null;
    }
}
