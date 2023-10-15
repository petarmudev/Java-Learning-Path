package L17_Lists;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task03_MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        You are going to receive two lists with numbers.
        Create a result list that contains the numbers from both of the lists.
        The first element should be from the first list, the second from the second list, and so on.
        If the length of the two lists is not equal, just add the remaining elements at the end of the list.
        Input                               Output
        ---------------------------------------------------------------------------------
        3 5 2 43 12 3 54 10 23              3 76 5 5 2 34 43 2 12 4 3 12 54 10 23
        76 5 34 2 4 12
        ---------------------------------------------------------------------------------
        76 5 34 2 4 12                      76 3 5 5 34 2 2 43 4 12 12 3 54 10 23
        3 5 2 43 12 3 54 10 23
         */

        List<Integer> firstNumbers = new ArrayList<>(Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList()));
        List<Integer> secondNumbers = new ArrayList<>(Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList()));

        List<Integer> resultedNumbers = new ArrayList<>();

        int firstSeqIdx = 0;
        int secondSeqIdx = 0;
        boolean isFirstSeqTurn = true;
        while (firstSeqIdx < firstNumbers.size() && secondSeqIdx < secondNumbers.size()) {
            if (isFirstSeqTurn) {
                resultedNumbers.add(firstNumbers.get(firstSeqIdx));
                firstSeqIdx++;
                isFirstSeqTurn = false;
            } else {
                resultedNumbers.add(secondNumbers.get(secondSeqIdx));
                secondSeqIdx++;
                isFirstSeqTurn = true;
            }
        }

        for (int i = firstSeqIdx; i < firstNumbers.size(); i++) {
            resultedNumbers.add(firstNumbers.get(i));
        }
        for (int i = secondSeqIdx; i < secondNumbers.size(); i++) {
            resultedNumbers.add(secondNumbers.get(i));
        }

        // System.out.println(resultedNumbers.toString().replaceAll("[\\[\\],]", ""));

        for (Integer number : resultedNumbers) {
            System.out.print(number.toString()
                    .replaceAll("[\\[\\],]", "") + " ");

        }
        System.out.println();


    }
}
