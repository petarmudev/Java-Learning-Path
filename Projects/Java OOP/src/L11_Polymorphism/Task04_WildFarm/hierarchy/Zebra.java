package L11_Polymorphism.Task04_WildFarm.hierarchy;

public class Zebra extends Mammal {
    public Zebra(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.printf("Zs%n");
    }
}