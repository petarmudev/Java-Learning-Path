import java.util.Scanner;

// Java Program to Demonstrate Working of matches() Method
// of String class
// Main class
public class Demo {

    // Main driver method
    public static void main(String args[]) {

        int num = 29;
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
    }
}
