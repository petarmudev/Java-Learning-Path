package L17_Generics_Task01_Jar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Jar<String> jar = new Jar<>();

        jar.add("blue cookie");
        jar.add("red cookie");
        jar.add("Green cookie");


    }
}
