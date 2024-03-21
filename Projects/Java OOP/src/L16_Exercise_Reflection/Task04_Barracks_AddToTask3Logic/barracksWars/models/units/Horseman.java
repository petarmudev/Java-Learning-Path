package L16_Exercise_Reflection.Task04_Barracks_AddToTask3Logic.barracksWars.models.units;

public class Horseman extends AbstractUnit {
    private static final int HORSEMAN_HEALTH = 50;
    private static final int HORSEMAN_DAMAGE = 10;


    protected Horseman() {
        super(HORSEMAN_HEALTH, HORSEMAN_DAMAGE);
    }
}
