package L23_DesignPatterns_MartinPaunov.commandPattern;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();

        Switch invoker = new Switch();

        invoker.storeAndExecute(new LightOn(lamp));
        invoker.storeAndExecute(new LightOff(lamp));

        invoker.undoExecuted();

        //Another example
        System.out.println("Another example:");
        Lamp lampInKitchen = new Lamp();
        Lamp lampInBedroom = new Lamp();
        Lamp lampInBathroom = new Lamp();

        Switch invokerTwo = new Switch();
        invokerTwo.storeAndExecute(new TurnAllLightsOn(Arrays.asList(lampInKitchen, lampInBathroom, lampInBedroom, lamp)));


    }
}
