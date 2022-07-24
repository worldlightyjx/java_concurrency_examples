package com.yang.designpatterns.singleton;

public class LazyStaticSingleton {
    private static LazyStaticSingleton lazySingletonInstance = null;

    private LazyStaticSingleton() {
    }

    private static class InnerClass {
        private static LazyStaticSingleton lazyStaticSingleton = new LazyStaticSingleton();
    }

    public static LazyStaticSingleton getLazyStaticInstance() {
        return InnerClass.lazyStaticSingleton;
    }
}
