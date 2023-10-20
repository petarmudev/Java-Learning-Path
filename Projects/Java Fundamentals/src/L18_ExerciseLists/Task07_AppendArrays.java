package L18_ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task07_AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> arrayList = Arrays.stream(scanner.nextLine().replace("\\s+", "")
                        .split("\\|"))
                .map(String::trim)
                .collect(Collectors.toList());

        for (int i = arrayList.size() - 1; i > 0; i--) {
            System.out.print(arrayList.get(i).replace("\\s+", "") + " ");
        }
        System.out.println(arrayList.get(0).replace("\\s+", ""));
    }
}
