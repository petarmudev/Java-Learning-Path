package L23_DesignPatterns_MartinPaunov.commandPattern;


public class LightOn implements Command {
    private Lamp lamp;

    public LightOn(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.on();
    }
}