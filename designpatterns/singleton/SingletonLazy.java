package designpatterns.singleton;

public class SingletonLazy {
    private static volatile SingletonLazy designPattern;

    private SingletonLazy() {}

    public static SingletonLazy getSingletonLazy() {
            if (designPattern == null) {
                synchronized (SingletonLazy.class) {
                    if (designPattern == null) {
                        designPattern = new SingletonLazy();
                    }
                }
            }
            return designPattern;
    }
}
