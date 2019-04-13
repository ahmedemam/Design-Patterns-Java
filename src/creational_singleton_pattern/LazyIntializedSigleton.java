package creational_singleton_pattern;

/*
  Lazy initialization method to implement Singleton pattern creates the instance in the global access method.
  The implementation works fine in case of the single-threaded environment but when it comes to multithreaded systems, it can cause issues if multiple threads are inside the if condition at the same time. It will destroy the singleton pattern and both threads will get the different instances of the singleton class. In next section, we will see different ways to create a thread-safe singleton class.
*/

public class LazyIntializedSigleton {
    private static LazyIntializedSigleton lazyIntializedSigleton_instance;
    private LazyIntializedSigleton(){}
    public static LazyIntializedSigleton getLazyIntializedSigleton_instance(){
        if(lazyIntializedSigleton_instance==null){
            lazyIntializedSigleton_instance=new LazyIntializedSigleton();
        }
        return lazyIntializedSigleton_instance;
    }
}
