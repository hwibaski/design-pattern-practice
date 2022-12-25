package ch06_singleton.example_practice;

/**
 * multi-thread safe
 * reflection unsafe
 * serialize unsafe
 * lazy initialize
 * simple logic
 */
public class ThreadSafeInnerClassSingleton {

    private ThreadSafeInnerClassSingleton() {
    }

    private static class ThreadSafeInnerClassSingletonHolder {

        private static final ThreadSafeInnerClassSingleton uniqueInstance = new ThreadSafeInnerClassSingleton();
    }

    public static ThreadSafeInnerClassSingleton getInstance() {
        return ThreadSafeInnerClassSingletonHolder.uniqueInstance;
    }
}
