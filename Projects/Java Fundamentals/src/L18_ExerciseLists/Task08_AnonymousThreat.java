package L18_ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task08_AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Anonymous has created a cyber-hyper virus that steals data from the CIA. As the lead security developer
         in the CIA, you have been tasked to analyze the software of the virus and observe its actions on the data.
        The virus is known for its innovative and unbelievably clever technique of merging and dividing data into partitions.
                *You will receive a single input line containing STRINGS separated by spaces.
        The strings may contain any ASCII character except whitespace.
        You will then begin receiving commands in one of the following formats:
                merge {startIndex} {endIndex}
                divide {index} {partitions}
        Whenever you receive the merge command, you must merge all elements from the startIndex to the endIndex.
         In other words, you should concatenate them.
            Example: {abc, def, ghi} -> merge 0 1 -> {abcdef, ghi}
        If any of the given indexes is out of the array, you must take ONLY the range that is INSIDE the array and
         merge it.
        Every time you receive the divide command, you must DIVIDE the element at the given index into several small
         substrings with equal length. The count of the substrings should be equal to the given partitions.
                *Example: {abcdef, ghi, jkl} -> divide 0 3 -> {ab, cd, ef, ghi, jkl}
        If the string CANNOT be exactly divided into the given partitions, make all partitions except the LAST with
         EQUAL LENGTHS, and make the LAST one – the LONGEST.
        Example: {abcd, efgh, ijkl} -> divide 0 3 -> {a, b, cd, efgh, ijkl}
                *The input ends when you receive the command "3:1".
        At that point, you must print the resulting elements, joined by a space.
        */

        List<String> texts = Arrays.stream(scanner.nextLine().split("\\s+")) //["Ivo", "Johny", "Tony", "Bony", "Mony"]
                .collect(Collectors.toList()); //{"Ivo", "Johny", "Tony", "Bony", "Mony"}

        String command = scanner.nextLine();

        while (!command.equals("3:1")) {
            if (command.contains("merge")) {
                //command = "merge {startIndex} {endIndex}"
                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex = Integer.parseInt(command.split(" ")[2]);

                //проверка startIndex
                if (startIndex < 0) {
                    startIndex = 0;
                }

                //проверка за endIndex
                if (endIndex > texts.size() - 1) {
                    endIndex = texts.size() - 1;
                }

                //валидиране на индексите -> [0, дълж - 1]
                if (startIndex >= 0 && startIndex <= texts.size() - 1 && endIndex >= 0 && endIndex <= texts.size() - 1) {
                    //валидни индекси -> преминем към изпълняване на командата
                    //{"Ivo", "Johny", "Tony", "Bony", "Mony"}
                    //merge 1 3
                    //взимаме елементите и ги обединяваме
                    String resultMerge = ""; //резултат от обединението на елементите
                    for (int index = startIndex; index <= endIndex; index++) {
                        String current = texts.get(index);
                        resultMerge += current;
                    }

                    //resulMerge = "JohnyTonyBony"
                    //премахваме обединените елементи
                    for (int index = startIndex; index <= endIndex; index++) {
                        texts.remove(startIndex);
                    }
                    //{"Ivo", "Mony"}

                    //добавяме обединението на startIndex
                    texts.add(startIndex, resultMerge);
                    //{"Ivo", "JohnyTonyBony", "Mony"}
                }
            } else if (command.contains("divide")) {
                //command = "divide {index} {partitions}"
                int index = Integer.parseInt(command.split(" ")[1]);
                int parts = Integer.parseInt(command.split(" ")[2]); //брой на частите

                //валидираме индекса, от който ще взимаме текст
                if (index >= 0 && index <= texts.size() - 1) {
                    //{"abcdef", "ghi", "jkl"}
                    //divide 0 3
                    String textForDivide = texts.get(index); //"abcdef"
                    texts.remove(index);
                    //{"ghi", "jkl"}

                    //1. колко символа ще има всяка част
                    int countSymbolsPerPart = textForDivide.length() / parts;

                    //всички равни части без последната
                    int beginIndex = 0; //index в текста за деление
                    for (int part = 1; part < parts; part++) {
                        String textPerPart = textForDivide.substring(beginIndex, beginIndex + countSymbolsPerPart);
                        texts.add(index, textPerPart);
                        index++; //място на поставяне на разбитата част в главния списък
                        beginIndex += countSymbolsPerPart;
                    }

                    //последната част
                    String textLastParts = textForDivide.substring(beginIndex, textForDivide.length());
                    texts.add(index, textLastParts);
                }
            }
            command = scanner.nextLine();
        }

        //!!!!отпчетваме списък с тесктовете -> String.join!!!
        System.out.println(String.join(" ", texts));

        /*for (String text : texts) {
            System.out.print(text + " ");
        }*/
    }
}