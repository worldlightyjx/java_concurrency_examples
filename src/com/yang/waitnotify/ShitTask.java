package com.yang.waitnotify;

public class ShitTask implements Runnable{
    private Washroom washroom;
    private String name;

    public ShitTask(Washroom washroom, String name) {
        this.washroom = washroom;
        this.name = name;
    }

    @Override
    public void run() {
        synchronized (washroom.getLock()){
            System.out.println(name+"get lock");
            while (!washroom.isAvailable()){

            }
            System.out.println(name+"finished shit");
        }

    }
}
