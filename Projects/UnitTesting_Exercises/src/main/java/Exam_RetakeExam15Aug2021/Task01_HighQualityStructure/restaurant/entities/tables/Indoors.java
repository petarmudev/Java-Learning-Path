package Exam_RetakeExam15Aug2021.Task01_HighQualityStructure.restaurant.entities.tables;

public class Indoors extends BaseTable {
    private static final double PRICE_PER_PERSON = 3.50;
    public Indoors(int number, int size) {
        super(number, size, PRICE_PER_PERSON);
    }
}