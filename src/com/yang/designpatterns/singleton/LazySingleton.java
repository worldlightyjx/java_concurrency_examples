package com.yang.designpatterns.singleton;

public class LazySingleton {
    private static LazySingleton lazySingletonInstance = null;

    private LazySingleton() {
    }

    public synchronized static LazySingleton getLazySingletonInstance() {
        if (lazySingletonInstance == null) {
            lazySingletonInstance = new LazySingleton();
        }
        return lazySingletonInstance;
    }
}
