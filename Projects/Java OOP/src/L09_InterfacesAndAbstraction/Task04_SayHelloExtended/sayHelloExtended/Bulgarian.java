package L09_InterfacesAndAbstraction.Task04_SayHelloExtended.sayHelloExtended;

public class Bulgarian extends BasePerson{
    public Bulgarian(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Здравей";
    }
}
