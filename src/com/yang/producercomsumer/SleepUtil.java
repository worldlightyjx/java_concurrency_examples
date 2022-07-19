package com.yang.producercomsumer;

import java.util.Random;

public class SleepUtil {
    private static Random random = new Random();

    public static void randomSleep(){
        try {
            Thread.sleep(random.nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
