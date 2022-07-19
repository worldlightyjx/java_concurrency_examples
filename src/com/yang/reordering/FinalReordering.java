package com.yang.reordering;

public class FinalReordering {
    int i;
    final int j;
    static FinalReordering obj;

    public FinalReordering() {
        i = 1;
        j = 2;
    }

    public static void write() {
        obj = new FinalReordering();
    }

    public static void read() {
        FinalReordering finalReordering = FinalReordering.obj;
        int a = finalReordering.i;
        int b = finalReordering.j;
    }
}
