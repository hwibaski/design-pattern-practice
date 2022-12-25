package ch06_singleton.example_practice;

/**
 * multi-thread safe
 * reflection unsafe
 * serialize unsafe
 * lazy initialize
 * complex logic
 */
public class ThreadSafeDCLSingleton {

    private static volatile ThreadSafeDCLSingleton uniqueInstance;

    private ThreadSafeDCLSingleton() {
    }

    public static ThreadSafeDCLSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (ThreadSafeSyncSingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new ThreadSafeDCLSingleton();
                }
            }
        }
        return uniqueInstance;
    }
}

