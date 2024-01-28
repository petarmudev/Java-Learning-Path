package L12_ExerciseFunctionalProgramming;

import java.util.Scanner;
import java.util.function.*;

public class Task01_ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Input: "Peter George Alex"
        String[] names = scanner.nextLine().split("\\s+");
        //Function<T, R>     -> .apply();    <приема, връща>
        //BiFunction<T, U,R> -> .apply()    <приема1, приема2, връща>
        //Consumer<T>        -> .accept()    <приема> не връща (void)
        //Supplier<T>        -> .get()       <връща>  не приема нищо
        //Predicate<T>       -> .test()      <приема, връща true/false>

        //Вариант 1
        Consumer<String> printer = name -> System.out.println(name);
        for (String name : names) {
            printer.accept(name);
        }

//        //Вариант 2
//        Consumer<String[]> printNamesArray = array -> {
//            for (int i = 0; i < array.length; i++) {
//                System.out.println(array[i]);
//            }
//        };
//        printNamesArray.accept(names);
//
//        //Вариант 3
//        for (String name : names) {
//            System.out.println(name);
//        }

    }
}
