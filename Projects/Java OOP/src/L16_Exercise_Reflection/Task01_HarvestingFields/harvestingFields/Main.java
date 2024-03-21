package L16_Exercise_Reflection.Task01_HarvestingFields.harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Map
        Map<String, List<Field>> fieldsMap = getFieldsMap(RichSoilLand.class);

        Consumer<Field> printField = field -> {
            System.out.println(Modifier.toString(field.getModifiers())
                    + " "
                    + field.getType().getSimpleName()
                    + " " + field.getName());
        };
        String command = scanner.nextLine();
        while (!command.equals("HARVEST")) {
            //Enums:
            //private, public, protected, all
            switch (command) {
                //Print:
                // "{access modifier} {field type} {field name}"
                case "private":
                    //fieldsMap.get(command).forEach(field -> printField.accept(field));
                    //fieldsMap.get(command).stream().forEach(printField);
                    fieldsMap.get(command).forEach(printField);
                    break;
                case "public":
                    fieldsMap.get(command).forEach(printField);
                    break;
                case "protected":
                    fieldsMap.get(command).forEach(printField);
                    break;
                case "all":
                    fieldsMap.get(command).forEach(printField);
                    break;
            }


            command = scanner.nextLine();
        }
        System.out.println();
    }

    private static Map<String, List<Field>> getFieldsMap(Class<RichSoilLand> richSoilLandClass) {
        Map<String, List<Field>> map = new HashMap<>();

        map.put("private", new ArrayList<>());
        map.put("public", new ArrayList<>());
        map.put("protected", new ArrayList<>());

        List<Field> fieldsList = Arrays.asList(richSoilLandClass.getDeclaredFields());
        map.put("all", fieldsList);

        fieldsList.forEach(field -> {
            String modifier = Modifier.toString(field.getModifiers());
            map.get(modifier).add(field);

//            switch (modifier) {
//                case "private":
//                    map.get("private").add(field);
//                    break;
//                case "public":
//                    map.get("public").add(field);
//                    break;
//                case "protected":
//                    map.get("protected").add(field);
//                    break;
//            }
        });
        return map;
    }


}
