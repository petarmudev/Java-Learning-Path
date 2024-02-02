package L14_ExerciseDefiningClasses.Task06_PokemonTrainer;


import java.util.ArrayList;
import java.util.List;

public class Trainer {
    //The trainer has a name, number of badges, and a collection of pokemon
    String name;
    private int badgesNumber = 0;
    public List<Pokemon> pokemonsList = new ArrayList<>();

    public List<Pokemon> getPokemonsList() {
        return pokemonsList;
    }


    public String getName() {
        return name;
    }

    public int getBadgesNumber() {
        return this.badgesNumber;
    }

    public Trainer (String name) {
        this.name = name;
    }

    public boolean ifExist(String element) {
        for (Pokemon pokemon : this.pokemonsList) {
            if (pokemon.getElement().equals(element)) {
                return true;
            }
        }
        return false;
    }

    public void checkElement(String element) {
        if (ifExist(element)) {
            this.badgesNumber += 1;

        } else {
            for (int i = 0; i < this.pokemonsList.size(); i++) {
                pokemonsList.get(i).decreaseHealth();
                if (!pokemonsList.get(i).isAlive()) {
                    pokemonsList.remove(i);
                    i--;
                }
            }
        }
    }

    @Override
    public String toString() {
        return name + " " + badgesNumber + " " + pokemonsList.size();
    }

    public void addPokemon(Pokemon pokemon) {
        this.pokemonsList.add(pokemon);
    }
}
