package com.yang.waitnotify;

public class RepairTaskWithWaitNotify implements Runnable{

    private Washroom washroom;

    public RepairTaskWithWaitNotify(Washroom washroom) {
        this.washroom = washroom;
    }

    @Override
    public void run() {
        synchronized (washroom.getLock()){
            System.out.println("Repair worker get lock");
            System.out.println("Repairing......");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            washroom.setAvailable(true);
            washroom.getLock().notifyAll();
            System.out.println("Repaired, release lock, good to shit");
        }
    }
}
