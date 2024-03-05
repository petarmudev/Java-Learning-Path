package L09_InterfacesAndAbstraction.Task04_SayHelloExtended.sayHelloExtended;

public class Chinese extends BasePerson{
    public Chinese(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}
