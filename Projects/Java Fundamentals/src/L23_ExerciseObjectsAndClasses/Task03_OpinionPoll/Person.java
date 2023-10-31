package L23_ExerciseObjectsAndClasses.Task03_OpinionPoll;

public class Person {
    //описваме всеки един човек
    private String name;
    private int age;
    //конструктор -> метод, чрез който създаваме обект от този клас

    public Person(String name, int age) {
        //нов празен обект
        this.name = name;
        this.age = age;
    }

    //методи -> действия, които ще извършва този класс
    // getters -> методи, които използваме за достъпване / взимане на стойността на полетата

    //1. getter на полето name -> взимам стойността на полето name
    public String getName() {
        return this.name;
    }

    //2. getter на полето age -> взимам стойността на полето age
    public int getAge() {
        return this.age;
    }
}
