package L08_ExerciseSetsAndMapsAdvanced;

import java.util.*;

public class Task08_UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, LinkedHashMap<String, Integer>> data = new TreeMap<>();
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] inputParts = input.split("\\s+");
            String ip = inputParts[0].split("=")[1];
            String username = inputParts[2].split("=")[1];

            //username не съществува:
            if (!data.containsKey(username)) {
                data.put(username, new LinkedHashMap<>() {{
                    put(ip, 1);
                }});
            }//username съществува:
            else {
                Map<String, Integer> currentIpsList = data.get(username);
                //IP-to го има в списъка(посещавано е)
                if (currentIpsList.containsKey(ip)) {
                    int currentCount = currentIpsList.get(ip);
                    currentIpsList.put(ip, currentCount + 1);
                }//IP-to го няма в списъка
                else {
                    currentIpsList.put(ip, 1);
                }
            }

            input = scanner.nextLine();
        }
        //Print:
//        "username:
//        {IP} => {count}, {IP} => {count}."

        //Print v1.0:
        data.keySet().forEach(username -> {
            System.out.println(username + ": ");
            Map<String, Integer> ipList = data.get(username);
            final int[] size = {ipList.size()};
            ipList.entrySet().forEach(entry -> {
                if (size[0] > 1) {
                    System.out.println(entry.getKey() + " => " + entry.getValue() + ", ");
                    size[0] -= 1;
                } else {
                    System.out.println(entry.getKey() + " => " + entry.getValue() + ".");
                }
            });
        });

        System.out.println("*************************************************");
        //Print v2.0:
        data.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ": ");
            LinkedHashMap<String, Integer> iplist = entry.getValue();
            int ipCount = iplist.size();
            int currentIpIndex = 0;

            for (Map.Entry<String, Integer> ipEntry : iplist.entrySet()) {
                System.out.print(ipEntry.getKey() + " => " + ipEntry.getValue());
                if (currentIpIndex < ipCount - 1) {
                    System.out.println(", ");
                } else {
                    System.out.println(".");
                }
                currentIpIndex++;
            }
            // System.out.println();
        });
    }
}
