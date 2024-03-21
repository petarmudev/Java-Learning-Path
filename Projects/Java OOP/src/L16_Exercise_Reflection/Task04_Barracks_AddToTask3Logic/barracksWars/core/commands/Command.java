package L16_Exercise_Reflection.Task04_Barracks_AddToTask3Logic.barracksWars.core.commands;

import L16_Exercise_Reflection.Task04_Barracks_AddToTask3Logic.barracksWars.interfaces.Executable;
import L16_Exercise_Reflection.Task04_Barracks_AddToTask3Logic.barracksWars.interfaces.Repository;
import L16_Exercise_Reflection.Task04_Barracks_AddToTask3Logic.barracksWars.interfaces.UnitFactory;

public abstract class Command implements Executable {
    private String[] data;
    private Repository repository;
    private UnitFactory unitFactory;

    protected Command(String[] data, Repository repository, UnitFactory unitFactory) {
        this.data = data;
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    protected String[] getData() {
        return data;
    }

    protected Repository getRepository() {
        return repository;
    }

    protected UnitFactory getUnitFactory() {
        return unitFactory;
    }
}
