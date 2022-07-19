package com.yang.producercomsumer;

import java.util.Queue;

public class Consumer extends Thread {
    private Queue<Food> queue;

    public Consumer(Queue<Food> queue, String name) {
        super(name);
        this.queue = queue;

    }

    @Override
    public void run() {
        while (true) {
            Food food;
            synchronized (queue) {
                while (queue.size() < 1) {
                    try {
                        System.out.println("queue size is " + queue.size() + "," + getName() + " waiting");
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                food = queue.remove();
                System.out.println(getName() + "get " + food);
                queue.notifyAll();
            }
            SleepUtil.randomSleep();
        }
    }
}

