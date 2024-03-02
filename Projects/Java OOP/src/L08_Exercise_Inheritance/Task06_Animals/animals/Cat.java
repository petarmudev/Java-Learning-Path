package L08_Exercise_Inheritance.Task06_Animals.animals;

public class Cat extends Animal{
    public Cat(String name, int age, String gender) {
        super(name, age, gender);
    }
    public String produceSound() {
        return "Meow meow";
    }
}
