package L17_Generics_Task02_ArrayCreator;

public class Main {
    public static void main(String[] args) {

        Integer[] arrayNums = ArrayCreator.create(5, 21);    //Същото действие,
        // като долните общо взето, просто не подаваме class
        String[] arrayNames = ArrayCreator.create(String.class,5, "Pesho"); //Тук подаваме class на метода
        String[] arrayNames2 = ArrayCreator.<String>create(5, "Pesho");     //Тук подаваме generic

        System.out.println();

    }
}
