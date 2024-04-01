package L23_DesignPatterns_MartinPaunov.commandPattern;

import java.util.List;

public class TurnAllLightsOn implements Command {
    private List<Lamp> lamps;

    public TurnAllLightsOn(List<Lamp> lamps) {
        this.lamps = lamps;
    }

    @Override
    public void execute() {
        for (Lamp lamp : lamps) {
            lamp.on();
        }
    }
}