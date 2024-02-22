package L23_Workshop_AlgorithmsIntroduction;

import java.util.*;
import java.util.stream.Collectors;

public class Task03_SumOfCoinsWithGreedyMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] coinsInput = scanner.nextLine().split(": ");
        int targetSum = Integer.parseInt(scanner.nextLine().split(": ")[1]);
        int[] coins = Arrays.stream(coinsInput[1].split(",\\s+")).mapToInt(Integer::parseInt).toArray();
        Map<Integer, Integer> coinsMap = new LinkedHashMap<>();
        Arrays.stream(coins).forEach(key -> coinsMap.put(key, 0));


        Map<Integer, Integer> selectedCoins = chooseCoins(coins, targetSum);
        if (selectedCoins.isEmpty()) {
            System.out.println("Error");
        } else {
            System.out.printf("Number of coins to take: %d%n",
                    selectedCoins.values().stream().mapToInt(Integer::intValue).sum());
            for (Integer key : selectedCoins.keySet()) {
                System.out.printf("%d coin(s) with value %d%n", selectedCoins.get(key), key);
            }
        }
    }

    public static Map<Integer, Integer> chooseCoins(int[] coins, int targetSum) {
        Arrays.sort(coins);
        List<Integer> sortedCoins = Arrays.stream(coins).boxed().collect(Collectors.toList());
        Collections.reverse(sortedCoins);
        Map<Integer, Integer> chosenCoins = new LinkedHashMap<>();
        int currentSum = 0;
        int coinIndex = 0;

        while (currentSum != targetSum && coinIndex < sortedCoins.size()) {
            int currentCoinValue = sortedCoins.get(coinIndex);
            int remainingSum = targetSum - currentSum;
            int numberOfCoinsToTake = remainingSum / currentCoinValue;
            if (numberOfCoinsToTake > 0) {
                chosenCoins.put(currentCoinValue, numberOfCoinsToTake);
            }
            currentSum += numberOfCoinsToTake * currentCoinValue;
            coinIndex++;
        }
        if (currentSum == targetSum) {
            return chosenCoins;
        } else {
            return new LinkedHashMap<>();
        }
    }
}
