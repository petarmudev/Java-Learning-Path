package L23_DesignPatterns_MartinPaunov.facadePattern;

import java.net.MalformedURLException;
import java.net.URL;

public class Demo {
    public static void main(String[] args) throws MalformedURLException {

    /*
    Facade Pattern:
    *Provides a UNIFIED INTERFACE to a set of interfaces in a subsystem

    *Defines a HIGHER-LEVEL INTERFACE that makes the subsystem easier to use(arrange)

    *Used to "wrap" APIs that we want to use and edit
     */
    //example of Facade class:
    URL url = new URL("http", "google.bg", 80, "/hello.html");

    //Another example: Hibernate APIs
        //https://www.baeldung.com/java-connect-mysql
    }
}
