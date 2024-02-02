package L14_ExerciseDefiningClasses.Task06_PokemonTrainer;

public class Pokemon {
    //Pokemon has a name, an element, and health, all values are mandatory.
    private String name;
    private String element;
    private int health;

    public Pokemon(String name, String element, int health) {
        this.name = name;
        this.element = element;
        this.health = health;
    }

    public String getElement() {
        return this.element;
    }

    public void decreaseHealth() {
        this.health -= 10;
    }

    public boolean isAlive() {
        return health > 0;
    }
}
