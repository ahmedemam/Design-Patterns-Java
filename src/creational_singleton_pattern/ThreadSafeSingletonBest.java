package creational_singleton_pattern;

public class ThreadSafeSingletonBest {
    private static volatile ThreadSafeSingletonBest instance;
    private static Object mutex = new Object();

    private ThreadSafeSingletonBest() {
    }

    public static ThreadSafeSingletonBest getInstance() {
        ThreadSafeSingletonBest threadSafeSingletonBest = instance;
        if (threadSafeSingletonBest == null) {
            synchronized (mutex) {
                threadSafeSingletonBest = instance;
                if (threadSafeSingletonBest == null) {
                    instance = threadSafeSingletonBest = new ThreadSafeSingletonBest();
                }
            }
        }
        return threadSafeSingletonBest;
    }
}
