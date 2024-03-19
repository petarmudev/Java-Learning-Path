package L04_Exercise_WorkingWithAbstraction.Task04_TrafficLights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] colorsInput = scanner.nextLine().split("\\s+");
        int times = Integer.parseInt(scanner.nextLine());
        //Смяна:
        //Ако е:
        //червена -> зелена
        //зелена -> жълта
        //жълта -> червена
        //Светофар -> съвкупност от крушки
        List<Light> trafficLight = new ArrayList<>();
        for (String color : colorsInput) {
            //създавам крушка с този цвят
            Light light = new Light(Color.valueOf(color));
            //добавят крушката в светофара
            trafficLight.add(light);
        }
        //Самото "сменяне" на цвета на "светофара"
        for (int i = 0; i < times; i++) {
            trafficLight.forEach(light -> {
                //сменям цвета
                light.changeColor();
                //отпечатвам цвета
                System.out.print(light.getColor() + " ");
            });
            System.out.println();
        }
    }
}
