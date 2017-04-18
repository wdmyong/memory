package com.wdm.mem;

import java.util.List;
import java.util.ArrayList;

/*
 * VM: -Xms10m -Xmx10m -XX:MetaspaceSize=3m -XX:MaxMetaspaceSize=3m
 */
public class RuntimeConsPoolOOM {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (true) {
            list.add(String.valueOf(i++).intern());
        }
    }
}
