package L09_InterfacesAndAbstraction.Task03_SayHello.sayHello;
public class Chinese implements Person {
    private String name;

    public Chinese(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String sayHello() {
        return String.format("Djydjybydjy");
    }

}