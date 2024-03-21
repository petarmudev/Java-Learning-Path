package L16_Exercise_Reflection.Task02_BlackBoxInteger.blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Class<BlackBoxInt> clazz = BlackBoxInt.class;

        //създавам обект от този клас
        Constructor<BlackBoxInt> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true); //правя конструктора достъпен

        BlackBoxInt blackBoxInt = constructor.newInstance();
        Field innerValue = clazz.getDeclaredField("innerValue");

        while (!input.equals("END")) {
            String command = input.split("_")[0];
            int number = Integer.parseInt(input.split("_")[1]);

            switch (command) {
                case "add":
//                    Method add = clazz.getDeclaredMethod("add", int.class);
//                    add.setAccessible(true);
//                    add.invoke(blackBoxInt, number);
//                    System.out.println(innerValue.get(blackBoxInt));
                    //Same as:
                    executeCommand(clazz, blackBoxInt, number, command, innerValue);
                    break;
                case "subtract":
                    executeCommand(clazz, blackBoxInt, number, command, innerValue);
                    break;
                case "divide":
                    executeCommand(clazz, blackBoxInt, number, command, innerValue);
                    break;
                case "multiply":
                    executeCommand(clazz, blackBoxInt, number, command, innerValue);
                    break;
                case "rightShift":
                    executeCommand(clazz, blackBoxInt, number, command, innerValue);
                    break;
                case "leftShift":
                    executeCommand(clazz, blackBoxInt, number, command, innerValue);
                    break;
            }

            input = scanner.nextLine();
        }

    }

    private static void executeCommand(Class<BlackBoxInt> clazz, BlackBoxInt blackBoxInt, int number, String command, Field innerValue) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Method add = clazz.getDeclaredMethod(command, int.class);
        add.setAccessible(true);
        add.invoke(blackBoxInt, number);
        innerValue.setAccessible(true);
        System.out.println(innerValue.get(blackBoxInt));
    }
}
