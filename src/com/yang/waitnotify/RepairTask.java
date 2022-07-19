package com.yang.waitnotify;

public class RepairTask implements Runnable{

    private Washroom washroom;

    public RepairTask(Washroom washroom) {
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
            System.out.println("Repaired, good to shit");
        }
    }
}
