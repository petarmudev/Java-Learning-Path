package L08_ExerciseSetsAndMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Task08_V2UserLogs {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, LinkedHashMap<String, Integer>> users = fillUsersMap(scanner);
        printUsersMap(users);


    }

    private static TreeMap<String, LinkedHashMap<String, Integer>> fillUsersMap(Scanner scanner) {
        TreeMap<String, LinkedHashMap<String, Integer>> users = new TreeMap<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String internetProtocol = input.split(" ")[0].split("=")[1];
            String username = input.split(" ")[2].split("=")[1];

            if (!users.containsKey(username)) {
                users.put(username, new LinkedHashMap<>());
                users.get(username).put(internetProtocol, 1);
            } else {
                if (!users.get(username).containsKey(internetProtocol)) {
                    users.get(username).put(internetProtocol, 1);
                } else {
                    int count = users.get(username).get(internetProtocol);
                    users.get(username).put(internetProtocol, count + 1);
                }
            }
            input = scanner.nextLine();
        }

        return users;
    }

    private static void printUsersMap(TreeMap<String, LinkedHashMap<String, Integer>> users) {

        users.entrySet().stream()
                .forEach(entry -> {
                    System.out.println(entry.getKey() + ": ");
                    LinkedHashMap<String, Integer> ipsMap = entry.getValue();
                    int ipCount = ipsMap.size();
                    int currentIpIndex = 0;
                    for (Map.Entry<String, Integer> ipEntry : ipsMap.entrySet()) {
                        System.out.print(ipEntry.getKey() + " => " + ipEntry.getValue());
                        if (currentIpIndex < ipCount - 1) {
                            System.out.println(", ");
                        } else {
                            System.out.println(".");
                        }
                        currentIpIndex++;
                    }
                    System.out.println();
                });
    }
}

/*IP=192.23.30.40 message='Hello&derps.' user=destroyer
IP=192.23.30.41 message='Hello&yall.' user=destroyer
IP=192.23.30.40 message='Hello&hi.' user=destroyer
IP=192.23.30.42 message='Hello&Dudes.' user=destroyer
end*/

