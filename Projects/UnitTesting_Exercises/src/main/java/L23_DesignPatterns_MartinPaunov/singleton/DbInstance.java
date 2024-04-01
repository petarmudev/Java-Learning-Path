package L23_DesignPatterns_MartinPaunov.singleton;

//This is Singleton example class to simulate DB connection
public class DbInstance {
    private static volatile DbInstance instance = null;     //"volatile" is for Thread safe!

    private DbInstance() {
        // Simulate DB connection (heavy work)

        if (instance != null) {     //This is how to protect out class from Reflection!!!
            throw new RuntimeException("To use DbInstance call getInstance()");
        }

        try {
            Thread.sleep(4000); //Delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static DbInstance getInstance() {
        if (instance == null) {
            synchronized (DbInstance.class) { // synchronized -> Thread safe
                if (instance == null) {
                    instance = new DbInstance();
                }
            }
        }
        return instance;
    }

    public int createTable() {
        System.out.println("Table users created");
        return 1;
    }
}