package com.yang.designpatterns.singleton;

public class LazySingletonThread implements Runnable {
    @Override
    public void run() {
        LazySingleton lazySingleton = LazySingleton.getLazySingletonInstance();
        System.out.println(Thread.currentThread().getName() + "->" + lazySingleton);
    }
}
