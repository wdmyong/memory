package com.wdm.mem;

import java.util.ArrayList;
import java.util.List;

/*
 * VM: -Xms1m -Xmx1m -XX:+HeapDumpOnOutOfMemoryError
 */
public class HeapOOM {

    static class OOMObejct {
    }

    public static void main(String[] args) {
        List<OOMObejct> list = new ArrayList<>();
        System.out.println("start");
        int i = 0;
        while (true) {
            i++;
            if (i % 10000 == 0) {
                System.out.println(i);
            }
            list.add(new OOMObejct());
        }
    }
}
