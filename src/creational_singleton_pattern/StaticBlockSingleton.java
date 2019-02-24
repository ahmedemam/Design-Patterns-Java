package creational_singleton_pattern;

/*
* Static block initialization implementation is similar to eager initialization, except that instance of class is created in the static block that provides option for exception handling.

* Both eager initialization and static block initialization creates the instance even before it’s being used and that is not the best practice to use. So in further sections, we will learn how to create a Singleton class that supports lazy initialization.
* */


public class StaticBlockSingleton {
    private static StaticBlockSingleton staticBlockSingleton_instance;
    private StaticBlockSingleton(){}
    static{
        try {
            staticBlockSingleton_instance=new StaticBlockSingleton();
        }catch (RuntimeException exception){
            throw new RuntimeException(exception.getMessage());
        }
    }

    public static StaticBlockSingleton getStaticBlockSingleton_instance() {
        return staticBlockSingleton_instance;
    }
}
