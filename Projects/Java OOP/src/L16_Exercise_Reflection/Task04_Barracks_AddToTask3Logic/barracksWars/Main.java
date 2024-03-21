package L16_Exercise_Reflection.Task04_Barracks_AddToTask3Logic.barracksWars;

import L16_Exercise_Reflection.Task04_Barracks_AddToTask3Logic.barracksWars.interfaces.Repository;
import L16_Exercise_Reflection.Task04_Barracks_AddToTask3Logic.barracksWars.interfaces.Runnable;
import L16_Exercise_Reflection.Task04_Barracks_AddToTask3Logic.barracksWars.interfaces.UnitFactory;
import L16_Exercise_Reflection.Task04_Barracks_AddToTask3Logic.barracksWars.core.Engine;
import L16_Exercise_Reflection.Task04_Barracks_AddToTask3Logic.barracksWars.core.factories.UnitFactoryImpl;
import L16_Exercise_Reflection.Task04_Barracks_AddToTask3Logic.barracksWars.data.UnitRepository;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}
