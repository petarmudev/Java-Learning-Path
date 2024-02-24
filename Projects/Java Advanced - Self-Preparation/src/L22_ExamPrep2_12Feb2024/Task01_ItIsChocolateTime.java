package L22_ExamPrep2_12Feb2024;

import java.util.*;

public class Task01_ItIsChocolateTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Double> milk = new ArrayDeque<>();   //Deque
        ArrayDeque<Double> cacao = new ArrayDeque<>();  //Stack

        Arrays.stream(scanner.nextLine().split("\\s+")).map(Double::parseDouble).forEach(milk::offer);
        Arrays.stream(scanner.nextLine().split("\\s+")).map(Double::parseDouble).forEach(cacao::push);

        //Chart to find the correct one
        Map<Double, String> chocolateTypes = new HashMap<>();
        chocolateTypes.put(30.0, "Milk Chocolate");
        chocolateTypes.put(50.0, "Dark Chocolate");
        chocolateTypes.put(100.0, "Baking Chocolate");

        //Store the chocolates made
        Map<String, Integer> chocoladesMade = new TreeMap<>();
        
        while (!milk.isEmpty() && !cacao.isEmpty()) {

            double milkValue = milk.poll();
            double cacaoPowderValue = cacao.pop();
            double cacaoPercent = cacaoPowderValue / (cacaoPowderValue + milkValue) * 100;
            if (chocolateTypes.containsKey(cacaoPercent)) {
                String chocolateName = chocolateTypes.get(cacaoPercent);
                chocoladesMade.putIfAbsent(chocolateName, 0);
                chocoladesMade.put(chocolateName, chocoladesMade.get(chocolateName) + 1);
            } else {
                milkValue += 10;
                milk.offer(milkValue);
            }
        }
        //at least 3 choco
        if (chocoladesMade.size() >= 3) {
            System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");
        } else {
            System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
        }
        //Print the made one:   " # {chocolate type} --> {amount}"
        chocoladesMade.entrySet().forEach(entry -> System.out.printf("# %s --> %d%n", entry.getKey(), entry.getValue()));
    }
}
