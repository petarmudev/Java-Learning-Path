package L05_WhileLoop_Exercise;

import java.util.Scanner;

public class Zad01_OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Старата Библиотека
        //Ани отива до родния си град след много дълъг период извън страната. Прибирайки се вкъщи, тя вижда старата библиотека на баба си
        // и си спомня за любимата си книга. Помогнете на Ани, като напишете програма, в която тя въвежда търсената от нея книга (текст).
        // Докато Ани не намери любимата си книга или не провери всички книги в библиотеката, програмата трябва да чете всеки път на нов ред
        // името на всяка следваща книга (текст), която тя проверява. Книгите в библиотеката са свършили щом получите текст "No More Books".
        //  Ако не открие търсената книгата да се отпечата на два реда:
        //      "The book you search is not here!"
        //      "You checked {брой} books."
        //  Ако открие книгата си се отпечатва един ред:
        //      "You checked {брой} books and found it."

        String bookName = scanner.nextLine();
        int count = 0;
        boolean isFound = false;
        String input = scanner.nextLine();
        while (!input.equals("No More Books")) {
            if (input.equals(bookName)) {
                isFound = true;
                break;
            }
            count++;
            input = scanner.nextLine();
        }
        if (isFound) {
            System.out.printf("You checked %d books and found it.", count);
        } else {
            System.out.printf("The book you search is not here!%nYou checked %d books.", count);
        }
    }
}
