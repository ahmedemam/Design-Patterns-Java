package creational_singleton_pattern;

/*
Using Reflection to destroy Singleton Pattern
Reflection can be used to destroy all the above singleton implementation approaches.

* */

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionDestroySingleton {
    public static void main(String[] args) {
        EagerInitializedSinglton instanceOne=EagerInitializedSinglton.getInstanceEagerIntializedSingleton();
        EagerInitializedSinglton instanceTwo=null;
        try {
            Constructor[] constructors=EagerInitializedSinglton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors){
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializedSinglton) constructor.newInstance();
                break;

            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }


}
