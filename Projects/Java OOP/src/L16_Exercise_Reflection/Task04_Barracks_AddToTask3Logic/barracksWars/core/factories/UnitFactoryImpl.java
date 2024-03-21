package L16_Exercise_Reflection.Task04_Barracks_AddToTask3Logic.barracksWars.core.factories;

import L16_Exercise_Reflection.Task04_Barracks_AddToTask3Logic.barracksWars.interfaces.Unit;
import L16_Exercise_Reflection.Task04_Barracks_AddToTask3Logic.barracksWars.interfaces.UnitFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

    private static final String UNITS_PACKAGE_NAME =
            "barracksWars.models.units.";

    @Override
    public Unit createUnit(String unitType) {
        try {
            Class clazz = Class.forName("barracksWars.models.units." + unitType);
            Constructor<Unit> constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true);
            return constructor.newInstance();
        } catch (ClassNotFoundException | InvocationTargetException | NoSuchMethodException | InstantiationException |
                 IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}

