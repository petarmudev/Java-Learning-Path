package L26_ExerciseAssociativeArrays;

import java.util.*;

public class Task09_ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> teams = new LinkedHashMap<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("Lumpawaroo")) {
                break;
            }

            //1. input = "Darker | DCay"
            //1. Да зададем потребителя към страна
            if (input.contains(" | ")) {
                String forceSide = input.split(" \\| ")[0];
                String forceUsername = input.split(" \\| ")[1];
                teams.putIfAbsent(forceSide, new ArrayList<>());

                //Проверка дали има такъв юзър в някой списък
                boolean isExist = false;
                for (List<String> userlist : teams.values()) {
                    if (userlist.contains(forceUsername)) {
                        isExist = true;
                        break;
                    }
                }
                if (!isExist) {
                    teams.get(forceSide).add(forceUsername);
                }
            }
            //2.Да преместим потребителя към друга страна
            //2. input = "Ivan Ivanov -> Lighter"
            else if (input.contains(" -> ")) {
                String username = input.split(" -> ")[0];
                String forceSide = input.split(" -> ")[1];
                teams.entrySet().forEach(entryTeam -> entryTeam.getValue().remove(username));

                if (!teams.containsKey(forceSide)) {
                    teams.put(forceSide, new ArrayList<>());
                    teams.get(forceSide).add(username);
                } else if (teams.containsKey(forceSide)) {
                    teams.get(forceSide).add(username);
                }
                System.out.printf("%s joins the %s side!%n", username, forceSide);
            }
        }

        //todo Print each side
        //In case there are NO force users on a side, you shouldn't print the side information!
        teams.entrySet().stream().filter(teamEntry -> teamEntry.getValue().size() > 0)
                .forEach(entry -> {
                    //entry: key (team) -> value (list of players)
                    //"Side: {forceSide}, Members: {forceUsers.Count}
                    System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().forEach(player -> System.out.println("! " + player));
                });
    }
}
