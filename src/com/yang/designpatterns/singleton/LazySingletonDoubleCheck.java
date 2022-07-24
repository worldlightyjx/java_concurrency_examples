package com.yang.designpatterns.singleton;

public class LazySingletonDoubleCheck {
    private volatile static LazySingletonDoubleCheck lazySingletonDoubleCheckInstance = null;

    private LazySingletonDoubleCheck() {
    }

    public static LazySingletonDoubleCheck getLazySingDoubleCheckSingletonInstance() {
        if (lazySingletonDoubleCheckInstance == null) {
            synchronized (LazySingletonDoubleCheck.class) {
                if (lazySingletonDoubleCheckInstance == null) {
                    lazySingletonDoubleCheckInstance = new LazySingletonDoubleCheck();
                }
            }
        }
        return lazySingletonDoubleCheckInstance;
    }
}
