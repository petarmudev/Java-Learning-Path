package L14_ExerciseDefiningClasses.Task07_Google;

import java.util.ArrayList;
import java.util.List;

public class Person {

    //company class
    // car class
    //List <Parent>
    //List <Child>
    //List <Pokemon>
    private Company company;
    private Car car;
    List<Parent> parents;
    private List<Child> children;
    List<Pokemon> pokemon;

    public Person() {
        //Винаги създаваме празни списъци, за да не са null !!!
        //За да избегнем: NullPointerExeption !
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
        this.pokemon = new ArrayList<>();
    }

    public Person(Company company, Car car, List<Parent> parents, List<Child> children, List<Pokemon> pokemons) {

        this.company = company;
        this.car = car;
        this.parents = parents;
        this.children = children;
        this.pokemon = pokemons;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Pokemon> getPokemon() {
        return this.pokemon;
    }

//    public  void setPokemon (Pokemon pokemon) {
//        this.pokemon = pokemon;
//    }

    public List<Parent> getParents() {
        return this.parents;
    }

    public List<Child> getChildren() {
        return this.children;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Company:").append("\n");
        if (company != null) {
            builder.append(company).append("\n");
        }
        builder.append("Car:").append("\n");
        if (car != null) {
            builder.append(car).append("\n");
        }
        builder.append("Pokemon:").append("\n");
        for (Pokemon pokemon : pokemon) {
            builder.append(pokemon).append("\n");
        }
        builder.append("Parents:").append("\n");
        for (Parent parent : parents) {
            builder.append(parent).append("\n");
        }
        builder.append("Children:").append("\n");
        for (Child child : children) {
            builder.append(child).append("\n");
        }
        return builder.toString();
    }
}
