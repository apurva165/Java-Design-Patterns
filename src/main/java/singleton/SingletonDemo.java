package singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        DbSingleton instance = DbSingleton.getInstance();

        DbSingleton instance1 = DbSingleton.getInstance();


        System.out.println(instance);
        System.out.println(instance1);
    }
}
