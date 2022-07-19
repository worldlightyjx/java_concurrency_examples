package com.yang.producercomsumer;

import java.util.Queue;

public class Producer extends Thread{
    private Queue<Food> queue;

    public Producer(Queue<Food> queue,String name) {
        super(name);
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            SleepUtil.randomSleep();
            Food food = new Food();
            System.out.println(getName()+"produce "+food);
            synchronized (queue){
                while (queue.size()>4){

                    try {
                        System.out.println("food over 5,size:  "+queue.size()+getName()+" waiting.....");
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                queue.add(food);
                queue.notifyAll();
            }
        }
    }
}
