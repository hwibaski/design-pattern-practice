package ch05_singleton.example_practice;

import java.io.Serializable;

/**
 * multi-thread safe
 * reflection unsafe
 * serialize safe
 * lazy initialize
 * simple logic
 */
public class ThreadSafeSerialSafeInnerClassSingleton {

    private ThreadSafeSerialSafeInnerClassSingleton() {
    }

    private static class ThreadSafeInnerClassSingletonHolder {

        private static final ThreadSafeSerialSafeInnerClassSingleton uniqueInstance = new ThreadSafeSerialSafeInnerClassSingleton();
    }

    public static ThreadSafeSerialSafeInnerClassSingleton getInstance() {
        return ThreadSafeInnerClassSingletonHolder.uniqueInstance;
    }

    protected Object readResolve() {
        return getInstance();
    }
}
