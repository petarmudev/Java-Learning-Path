package ExamSelfPreparation.Task03_Aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private String name;
    private int capacity;
    private int size; //The volume of the pool
    private List<Fish> fishInPool;

    public Aquarium(String name, int capacity, int size) {
        this.name = name;
        this.capacity = capacity;
        this.size = size;
        this.fishInPool = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }

    public int getFishInPool() {
        return fishInPool.size();
    }

    public void add(Fish fish) {
        //ако няма такава риба
        boolean haveSameFish = false;
        for (Fish fishName : fishInPool) {
            if (fishName.getName().equals(fish.getName())) {
                haveSameFish = true;
            }
        }
        //и ако има място в аквариума
        if (!haveSameFish && capacity > getFishInPool()) {
            this.fishInPool.add(fish);
        }
    }

    public boolean remove(String name) {
        //true ако успешно премахнем риба
        //false ако няма такава риба
        Fish removedFish = null;
        for (Fish fish : fishInPool) {
            if (fish.getName().equals(name)) {
                removedFish = fish;
            }
        }
        if (removedFish == null) {
            return false;
        } else {
            fishInPool.remove(removedFish);
            return true;
        }
    }

    public Fish findFish(String name) {
        for (Fish fish : fishInPool) {
            if (fish.getName().equals(name)) {
                return fish;
            }
        }
        //Не е намерена такава риба
        return null;
    }

    public String report() {
        StringBuilder builder = new StringBuilder();

        builder.append(String.format("Aquarium: %s ^ Size: %d%n", name, size));
        for (Fish fish : fishInPool) {
            builder.append(fish.toString()).append("\n");
        }
        return builder.toString();
    }


}
