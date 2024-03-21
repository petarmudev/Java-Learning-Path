package L16_Exercise_Reflection.Task04_Barracks_AddToTask3Logic.barracksWars.interfaces;

public interface CommandInterpreter {

	Executable interpretCommand(String[] data, String commandName);
}
