package Exam_RetakeExam15Aug2021.Task01_HighQualityStructure.restaurant.entities.healthyFoods;

public class Salad extends Food{
    private static final int PORTION_SIZE = 150;
    public Salad(String name, double price) {
        super(name, PORTION_SIZE, price);
    }
}
