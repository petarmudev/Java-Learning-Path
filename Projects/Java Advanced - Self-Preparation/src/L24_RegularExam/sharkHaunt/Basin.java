package L24_RegularExam.sharkHaunt;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Basin {
    //private List<Shark> data;
    private String name;
    private int capacity;
    private List<Shark> sharks;

    public Basin(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.sharks = new ArrayList<>();
    }

    public void addShark(Shark shark) { //adds an entity to the data if a space for it, otherwise print: "This basin is at full capacity!"
        if (this.sharks.size() < capacity) {
            this.sharks.add(shark);
        } else {
            System.out.println("This basin is at full capacity!");
        }
    }

    public boolean removeShark(String kind) {//removes a shark by given kind, if such exists, and returns boolean (true if it is removed, otherwise – false)
        for (Shark shark : this.sharks) {
            if (shark.getKind().equals(kind)) {
                this.sharks.remove(shark);
                return true;
            }
        }
        return false;
    }

    public Shark getLargestShark() { //returns the largest shark by length in the given basin

        if (this.sharks.isEmpty()) {
            return null;
        } else {
            return this.sharks.stream().max(Comparator.comparing(Shark::getLength)).get();
        }
    }

    public Shark getShark(String kind) { //returns the shark with the given kind, otherwise – returns null
        for (Shark shark : this.sharks) {
            if (shark.getKind().equals(kind)) {
                return shark;
            }
        }
        return null;
    }

    public int getCount() { //returns the count of sharks in the given basin
        return this.sharks.size();
    }

    public int getAverageLength() {
        return (int) this.sharks.stream().mapToInt(Shark::getLength).average().orElse(0);
    }
    public String report() { /*– returns a string in the following format (print the sharks in order of addition):
            ◦ "Sharks in {basin name}:
    The {kind} is {length} centimeters long, eats {food} and inhabits {habitation}.
    The {kind} is {length} centimeters long, eats {food} and inhabits {habitation}.
            (…)" */
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("Sharks in %s:%n", this.name));
        for (Shark shark : this.sharks) {
            builder.append(shark).append("\n");
        }
        return builder.toString();
    }

}
