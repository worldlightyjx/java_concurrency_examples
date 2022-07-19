package com.yang.reordering;

public class Reordering {
    private static boolean flag;
    private static int num;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!flag){
                    Thread.yield();
                }
                System.out.println(num);
            }

        },"t1");
        t1.start();
        num = 5;
        flag = true;
    }
}
