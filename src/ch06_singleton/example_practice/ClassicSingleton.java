package ch06_singleton.example_practice;

/**
 * multi-thread unsafe
 * reflection unsafe
 * serialize unsafe
 * lazy initialize
 * simple logic
 */
public class ClassicSingleton {

    private static ClassicSingleton uniqueInstance;

    private ClassicSingleton() {
    }

    public static ClassicSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ClassicSingleton();
        }

        return uniqueInstance;

    }

}
