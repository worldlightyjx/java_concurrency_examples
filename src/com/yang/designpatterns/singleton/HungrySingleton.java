package com.yang.designpatterns.singleton;

import java.io.Serializable;

public class HungrySingleton implements Serializable {
    private final static HungrySingleton hungrySingleton;
    static {
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton() {
        if(hungrySingleton!=null){
            throw new RuntimeException("error, do not use reflection");
        }

    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }


    private Object readResolve(){
        return hungrySingleton;
    }
}
