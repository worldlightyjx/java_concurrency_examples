package com.yang.waitnotify;

public class ShitTaskWithWaitNotify implements Runnable{
    private Washroom washroom;
    private String name;

    public ShitTaskWithWaitNotify(Washroom washroom, String name) {
        this.washroom = washroom;
        this.name = name;
    }

    @Override
    public void run() {
        synchronized (washroom.getLock()){
            System.out.println(name+"get lock");
            while (!washroom.isAvailable()){
                try {
                    washroom.getLock().wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(name+"finished shit");
        }

    }
}
