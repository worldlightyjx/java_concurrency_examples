package com.yang.designpatterns.singleton;

import java.io.*;
import java.lang.reflect.Constructor;

public class LazySingletonTest {
    public static void main(String[] args) throws Exception {
//        Thread t1 = new Thread(new LazySingletonThread());
//        Thread t2 = new Thread(new LazySingletonThread());
//
//        t1.start();
//        t2.start();
//
//        System.out.println("finished");

//
//        HungrySingleton instance = HungrySingleton.getInstance();
//
//        EnumInstance instance = EnumInstance.getInstance();
//        instance.setData(new Object());
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        oos.writeObject(instance);
//
//
//        File file  = new File("singleton_file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//
////        HungrySingleton newInstance = (HungrySingleton) ois.readObject();
//        EnumInstance newInstance = (EnumInstance) ois.readObject();
//        System.out.println(instance.getData());
//        System.out.println(newInstance.getData());
//        System.out.println(instance.getData() == newInstance.getData());


//
//        Class objectClass = HungrySingleton.class;
//        Class objectClass = EnumInstance.class;
//        Constructor constructor = objectClass.getDeclaredConstructor(String.class,int.class);
//        constructor.setAccessible(true);
//
////        HungrySingleton instance = HungrySingleton.getInstance();
////        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();
//
//        EnumInstance instance = (EnumInstance) constructor.newInstance("yang",666);

//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);


        EnumInstance instance = EnumInstance.getInstance();


    }
}
