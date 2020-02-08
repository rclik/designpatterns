package com.rcelik.creational.singleton;

public final class LazyLoadingSingleton {

    private static LazyLoadingSingleton instance;

    // important since the class cannot be initialized any other object
    private LazyLoadingSingleton(){
    }

    public static LazyLoadingSingleton getInstance(){
        // the instance is instantiated when there is a need for the object
        // called lazy-loading
        if(instance == null)
            instance = new LazyLoadingSingleton();

        return instance;
    }
}
