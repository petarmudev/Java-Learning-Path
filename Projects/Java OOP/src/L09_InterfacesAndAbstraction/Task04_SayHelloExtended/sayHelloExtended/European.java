package L09_InterfacesAndAbstraction.Task04_SayHelloExtended.sayHelloExtended;

public class European extends BasePerson{
    public European(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}
