package L16_Exercise_Reflection.Task04_Barracks_AddToTask3Logic.barracksWars.interfaces;


public interface Repository {

	void addUnit(Unit unit);

	String getStatistics();

	void removeUnit(String unitType);
}
