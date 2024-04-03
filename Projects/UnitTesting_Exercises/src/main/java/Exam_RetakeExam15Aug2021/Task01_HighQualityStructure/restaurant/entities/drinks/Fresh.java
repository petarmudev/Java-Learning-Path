package Exam_RetakeExam15Aug2021.Task01_HighQualityStructure.restaurant.entities.drinks;

public class Fresh extends BaseBeverage {
    private static final double FRESH_PRICE = 3.5;
    public Fresh(String name, int counter, String brand) {
        super(name, counter, FRESH_PRICE, brand);
    }
}
