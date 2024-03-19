package L08_Exercise_Inheritance.Task06_Animals.animals;

public class Tomcat extends Cat{
    public Tomcat(String name, int age) {
        super(name, age, "Male");
    }
    @Override
    public String produceSound() {
        return "MEOW";
    }
}
