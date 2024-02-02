package L14_ExerciseDefiningClasses.Task06_PokemonTrainer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Trainer> trainerList = new LinkedHashMap<>();
        //First task: collect the pokemons
        while (true) {
            String input = scanner.nextLine();
            if ("Tournament".equals(input)) {
                break;
            }
            // "{TrainerName} {PokemonName} {PokemonElement} {PokemonHealth}"
            String[] inputData = input.split("\\s+");
            String trainerName = inputData[0];

            if (!trainerList.containsKey(trainerName)) {
                trainerList.put(trainerName, new Trainer(trainerName));
            }
            String pokemonName = inputData[1];
            String pokemonElement = inputData[2];
            int pokemonHealth = Integer.parseInt(inputData[3]);

            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);

            trainerList.get(trainerName).addPokemon(pokemon);
        }
        //Second task: check each trainer's pokemon for the element
        while (true) {
            String element = scanner.nextLine();
            if (element.equals("End")) {
                break;
            }
            trainerList.entrySet().forEach(trainer -> {
                trainer.getValue().checkElement(element);
            });
        }
        //Print the trainers sorted by badges number in reversed order
        trainerList.entrySet().stream()
                .sorted((t1, t2) -> Integer.compare(t2.getValue().getBadgesNumber(), t1.getValue().getBadgesNumber()))
                .forEach(trainer -> System.out.printf("%s %s %s%n",
                        trainer.getKey(),
                        trainer.getValue().getBadgesNumber(),
                        trainer.getValue().getPokemonsList().size()));
    }
}
