package singleton;

public class DbSingleton {// only one instance in application run time
    // private static DbSingleton instance = new DbSingleton(); //eagerly loaded (always created at runtime)

    private static volatile DbSingleton instance = null;

    private DbSingleton() {
        if (instance != null) {
            throw new RuntimeException("use get instance method");
        }

    }

    public static synchronized DbSingleton getInstance() {
        if (instance == null) {
            instance = new DbSingleton(); //lazy loaded (only created if needed)
        }
        return instance;
    }


}
