package com.yang.waitnotify;

public class ShitTestWithWaitAndNotify {
    public static void main(String[] args) {
        Washroom washroom = new Washroom();
        new Thread(new ShitTaskWithWaitNotify(washroom,"Tom"),"Tom-thread").start();
        new Thread(new ShitTaskWithWaitNotify(washroom,"Andy"),"Andy-thread").start();
        new Thread(new ShitTaskWithWaitNotify(washroom,"Yang"),"Yang-thread").start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(new RepairTaskWithWaitNotify(washroom),"REPAIRED-THREAD").start();


    }
}
