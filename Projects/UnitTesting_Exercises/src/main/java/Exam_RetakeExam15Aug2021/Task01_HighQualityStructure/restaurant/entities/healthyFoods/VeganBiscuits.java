package Exam_RetakeExam15Aug2021.Task01_HighQualityStructure.restaurant.entities.healthyFoods;

public class VeganBiscuits extends Food{
    private static final int INITIAL_BISCUITS_PORTION = 205;
    public VeganBiscuits(String name, double price) {
        super(name, INITIAL_BISCUITS_PORTION, price);
    }
}
