package com.yang.producercomsumer;

public class Food {
    private static int counter = 0;

    private int i;

    public Food(){
        i = ++counter;
    }

    @Override
    public String toString() {
        return "NO."+i+"dish";
    }
}
