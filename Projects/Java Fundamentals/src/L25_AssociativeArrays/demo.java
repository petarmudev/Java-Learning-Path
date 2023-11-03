package L25_AssociativeArrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class demo {
    public static void main(String[] args) {


        HashMap<String, Integer> airplanes = new HashMap<>();
        airplanes.put("Boeing 737", 130);
        airplanes.put("Airbus A320", 150);

        System.out.println(airplanes);

        airplanes.remove("Boeing 737");

        System.out.println(airplanes);
        //
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Airbus A320", 150);
        map.put("Airbus A320", 150);
        if (map.containsKey("Airbus A320"))
            System.out.println("Airbus A320 key exists");
        System.out.println(map);
        //
        Map<String, Double> fruits = new LinkedHashMap<>();
        fruits.put("banana", 2.20);
        fruits.put("kiwi", 4.50);

        for (Map.Entry<String, Integer> kvp : map.entrySet()){
            System.out.printf("%s -> %d%n", kvp.getKey(), kvp.getValue());
        }

        for (String key : map.keySet()){
            int value = map.get(key);
            System.out.printf("%s -> %s%n", key, value);
        }

//        for (Map.Entry<K, V> entrye : fruits.entrySet()) {
//            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
//        }

    }
}
