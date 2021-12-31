package DesignPatterns.singleton;

public class SingletonDesignPatternEarly {

    private static final SingletonDesignPatternEarly designPattern = new SingletonDesignPatternEarly();

    private SingletonDesignPatternEarly() {}

    public static SingletonDesignPatternEarly getSingletonDesignPattern() {
        return designPattern;
    }
}
