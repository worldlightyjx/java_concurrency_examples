package com.yang.producercomsumer;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerAndConsumerTest {
    public static void main(String[] args) {
        Queue<Food> queue = new LinkedList<>();

        new Producer(queue,"1 cook").start();
        new Producer(queue,"2 cook").start();
        new Producer(queue,"3 cook").start();
        new Producer(queue,"4 cook").start();
        new Consumer(queue,"a-waiter").start();
        new Consumer(queue,"b-waiter").start();
        new Consumer(queue,"c-waiter").start();
        new Consumer(queue,"d-waiter").start();
    }
}
