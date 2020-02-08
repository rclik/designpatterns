package com.rcelik.creational.singleton;

public final class SingletonWithHelper {


    // this singleton object is instantiated  by a helper class
    // when getInstance is first requested, then it is instantiated inside holder class
    // this is also lazy-loading and thread-safe


    // in order to avoid instantiating the class with any other object
    private  SingletonWithHelper(){}


    private static class SingletonHolder{
        private static final SingletonWithHelper INSTANCE = new SingletonWithHelper();
    }

    public static SingletonWithHelper getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
