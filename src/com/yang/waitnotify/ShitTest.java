package com.yang.waitnotify;

public class ShitTest {
    public static void main(String[] args) {
        Washroom washroom = new Washroom();
        new Thread(new RepairTask(washroom),"REPAIRED-THREAD").start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        new Thread(new ShitTask(washroom,"Tom"),"Tom-thread").start();
        new Thread(new ShitTask(washroom,"Andy"),"Andy-thread").start();
        new Thread(new ShitTask(washroom,"Yang"),"Yang-thread").start();
    }
}
