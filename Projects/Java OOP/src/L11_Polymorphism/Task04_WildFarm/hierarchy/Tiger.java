package L11_Polymorphism.Task04_WildFarm.hierarchy;

public class Tiger extends Felime{
    public Tiger(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.printf("ROAAR!!!%n");
    }
    @Override
    public boolean canEatFood(Food food) {
        return food.getClass().getSimpleName().equals("Meat");
    }
}