package L09_InterfacesAndAbstraction.Task03_SayHello.sayHello;

public class European implements Person {
    private String name;

    public European(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String sayHello() {
        return String.format("Hello");
    }

}