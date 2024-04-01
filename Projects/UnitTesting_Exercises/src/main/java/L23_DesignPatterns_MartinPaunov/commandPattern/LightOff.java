package L23_DesignPatterns_MartinPaunov.commandPattern;

public class LightOff implements Command {
    private Lamp lamp;

    public LightOff(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.off();
    }
}