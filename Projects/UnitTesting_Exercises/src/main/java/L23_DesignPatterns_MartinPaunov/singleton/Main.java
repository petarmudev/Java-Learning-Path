package L23_DesignPatterns_MartinPaunov.singleton;

import java.sql.SQLOutput;
import java.util.Timer;

public class Main {
    public static void main(String[] args) {
        //Runtime runtime = Runtime.getRuntime() //Singleton example
        //System.out.println(runtime);
        //runtime.gc(); //Force the GarbageCollector to clean the unused resources.
        //Runtime secondRuntime = Runtime.getRuntime() //Same object!
        //System.out.println(secondRuntime); //Same object!

        long start = System.currentTimeMillis();

        DbInstance dbInstance = DbInstance.getInstance();
        dbInstance.createTable();

        long end = System.currentTimeMillis();

        System.out.println(end - start + " ms.");

        start = System.currentTimeMillis();

        DbInstance dbInstanceTwo = DbInstance.getInstance(); //in fact it is the same object as above(Singleton)
        dbInstanceTwo.createTable();

        end = System.currentTimeMillis();

        System.out.println(end - start + " ms."); //Faster because of Singleton
    }
}
