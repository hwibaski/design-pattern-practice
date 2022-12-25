package ch06_singleton.example_practice;

/**
 * multi-thread safe
 * reflection unsafe
 * serialize unsafe
 * lazy initialize
 * low performance
 */
public class ThreadSafeSyncSingleton {

    private static ThreadSafeSyncSingleton uniqueInstance;

    private ThreadSafeSyncSingleton() {
    }

    public static synchronized ThreadSafeSyncSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ThreadSafeSyncSingleton();
        }
        return uniqueInstance;
    }
}
