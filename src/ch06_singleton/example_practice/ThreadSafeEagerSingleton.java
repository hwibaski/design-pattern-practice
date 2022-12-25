package ch06_singleton.example_practice;

/**
 * multi-thread safe
 * reflection unsafe
 * serialize unsafe
 * eager
 * initialize
 * simple logic
 */
public class ThreadSafeEagerSingleton {

    private static final ThreadSafeEagerSingleton uniqueInstance = new ThreadSafeEagerSingleton();

    private ThreadSafeEagerSingleton() {
    }

    public static ThreadSafeEagerSingleton getInstance() {
        return uniqueInstance;
    }

}
