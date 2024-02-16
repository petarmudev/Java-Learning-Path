package L22_ExamPrep2_12Feb2024.parrots;

import java.util.ArrayList;
import java.util.List;

public class Cage {
    private String name;
    private int capacity;
    private List<Parrot> data;

    public Cage(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void add(Parrot parrot) {
        if (this.data.size() < this.capacity) {
            this.data.add(parrot);
        }
    }

    public boolean remove(String name) {
        //method - removes a parrot by given name,if such exists,
        //and returns boolean
        for (Parrot parrot : this.data) {
            if (parrot.getName().equals(name)) {
                this.data.remove(parrot);
                return true;
            }
        }
        return false;
    }

    public Parrot sellParrot(String name) {
        //sellParrot(set its available property to false without removing it from the collection)
        //the first parrot with the given name, also return the parrot
        for (Parrot parrot : this.data) {
            if (parrot.getName().equals(name)) {
                parrot.setAvailable(false);
                return parrot;
            }
        }
        return null;
    }

    public List<Parrot> sellParrotBySpecies(String species) {
        // method - sells and returns all parrots from that species as a List
        List<Parrot> collectParrots = new ArrayList<>();
        for (Parrot parrot : this.data) {
            if (parrot.getSpecies().equals(species)) {
                parrot.setAvailable(false);
                collectParrots.add(parrot);
            }
        }
        return collectParrots;
    }

    public int count() {
        return this.data.size();
    }

    // report() - Returns a String in the following format, including only not sold parrots:
    // "Parrots available at {cageName}:
    // {Parrot 1}
    // {Parrot 2}
    // (…)"
    public String report() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("Parrots available at %s:%n", this.name));
        for (Parrot parrot : this.data) {
            if (parrot.isAvailable()) {
                builder.append(parrot).append("\n");
            }
        }
        return builder.toString();
    }
}
