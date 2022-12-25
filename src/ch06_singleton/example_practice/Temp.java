package ch06_singleton.example_practice;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Temp {

    public static void main(String[] args)
        throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {

        // --------------------initialize with reflection-------------------------
//        ThreadSafeSyncSingleton classicSingleton = ThreadSafeSyncSingleton.getInstance();
//
//        ThreadSafeSyncSingleton classicSingleton1 = ThreadSafeSyncSingleton.getInstance();
//
//        Constructor<ThreadSafeSyncSingleton> declaredConstructor = ThreadSafeSyncSingleton.class.getDeclaredConstructor();
//        declaredConstructor.setAccessible(true);
//        ThreadSafeSyncSingleton classicSingleton2 = declaredConstructor.newInstance();
//
//
//        System.out.println(classicSingleton1 == classicSingleton);
//        System.out.println(classicSingleton == classicSingleton2);

        // --------initialize with serialize------------
//        ThreadSafeSerialSafeInnerClassSingleton threadSafeSyncSingleton = ThreadSafeSerialSafeInnerClassSingleton.getInstance();
//        ThreadSafeSerialSafeInnerClassSingleton temp = null;
//
//        try (ObjectOutput out = new ObjectOutputStream(
//            new FileOutputStream("threadSafeSyncSingleton.obj"))) {
//            out.writeObject(threadSafeSyncSingleton);
//        }
//
//
//        try (ObjectInput in = new ObjectInputStream(
//            new FileInputStream("threadSafeSyncSingleton.obj"))) {
//            temp = (ThreadSafeSerialSafeInnerClassSingleton) in.readObject();
//        }
//
//        System.out.println(threadSafeSyncSingleton == temp);
        // -----------------------------------------------------------------------------

        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        EnumSingleton enumSingleton1 = null;
        Constructor<?>[] declaredConstructors = EnumSingleton.class.getDeclaredConstructors();

        for (Constructor<?> constructor : declaredConstructors) {
            constructor.setAccessible(true);
            enumSingleton1 = (EnumSingleton) constructor.newInstance("INSTANCE");
        }

        System.out.println(enumSingleton == enumSingleton1);


    }

}
