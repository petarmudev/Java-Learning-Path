package L11_FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class Demo_FunctionalProgramming {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(5);
        myList.add(8);
        System.out.println(myList.toString().replaceAll("\\[", "").replaceAll("]", ""));
//------------------------------------------------------------------------------------------------------
            //In Java Function<T,R> is an interface, that accepts a parameter of type T and returns a cariable of type R
        Function<Integer, Integer> numberFunc = x -> x + 5;
            //Usages:
        numberFunc.apply(5);
        int a = numberFunc.apply(5);

        // BiFunction<T, U, R> - takes two arguments and returns one
        BiFunction<Integer, Integer, String> myBiFuncSum = (x, y) -> "Sum is: " + (x + y);
//------------------------------------------------------------------------------------------------------
            //In Java Consumer<T> is a void interface
            //We use Consumer with .accept();
        Consumer<String> print = message -> System.out.println(message);
        print.accept("Hello");

            //BiConsumer takes two items and it is void function
        BiConsumer<String, Integer> myBiConsumer = (String name, Integer age) -> System.out.println(name + age);
//------------------------------------------------------------------------------------------------------
            // Supplier<T> takes no parameters:
        Supplier<Integer> getRandomInt = () -> new Random().nextInt(51);
            //We use Supplier with .get()
        int random = getRandomInt.get();
        System.out.println(random);

//------------------------------------------------------------------------------------------------------
            //In Java Predicate<T> evaluates a condition (boolean):
        Predicate<Integer> isEven = number -> number % 2 == 0;
            //We use it with .test();
        System.out.println("Is even (5): " + isEven.test(5));

        //BiPredicate <T, U> takes two items and returns boolean
        BiPredicate<Integer , Integer> miBiPredicate = (x, y) -> x > y;
//------------------------------------------------------------------------------------------------------

        //UnaryOperator<T> extends Function<T, R>
        //Връща същия тип променлива, като подадената
        UnaryOperator<Double> addVat = e -> 1.2 * e;
        double priceWithVAT = addVat.apply(11.67);
        System.out.println("Price with addVAT: " + priceWithVAT);

    }
}
