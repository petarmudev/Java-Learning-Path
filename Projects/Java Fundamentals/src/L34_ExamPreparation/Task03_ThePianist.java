package L34_ExamPreparation;

import com.sun.source.tree.Tree;

import java.util.*;

public class Task03_ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPieces = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, String> pieces = new LinkedHashMap<>();
        LinkedHashMap<String, String> keys = new LinkedHashMap<>();

        for (int i = 0; i < numberOfPieces; i++) {
            String command = scanner.nextLine();
            String[] commandParts = command.split("\\|");
            // "{piece}|{composer}|{key}"
            String piece = commandParts[0];
            String composer = commandParts[1];
            String key = commandParts[2];

            pieces.putIfAbsent(piece, composer);
            keys.putIfAbsent(piece, key);
        }

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Stop")) {
                break;
            }
            String[] commandParts = input.split("\\|");
            String command = commandParts[0];
            String piece = commandParts[1];

            switch (command) {
                case "Add":  // "Add|Sonata No.2|Chopin|B Minor"
                    String composer = commandParts[2];
                    String key = commandParts[3];

                    if (!pieces.containsKey(piece)) {
                        pieces.put(piece, composer);
                        keys.put(piece, key);
                        System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                    } else {
                        System.out.printf("%s is already in the collection!%n", piece);
                    }
                    break;
                case "Remove":  // "Remove|Clair de Lune"
                    if (pieces.containsKey(piece)) {
                        System.out.printf("Successfully removed %s!%n", piece);
                        pieces.remove(piece);
                        keys.remove(piece);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }
                    break;

                case "ChangeKey":  // "ChangeKey|{piece}|{new key}"
                    String newKey = commandParts[2];
                    if (keys.containsKey(piece)) {
                        keys.put(piece, newKey);
                        System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }
                    break;
                default:
                    break;
            }
        }
        //Print:  "{Piece} -> Composer: {composer}, Key: {key}"
        pieces.entrySet().forEach(piece -> {
            System.out.printf("%s -> Composer: %s, Key: %s%n", piece.getKey(), piece.getValue(), keys.get(piece.getKey()));
        });
    }
}
