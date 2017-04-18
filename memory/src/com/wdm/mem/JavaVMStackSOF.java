package com.wdm.mem;

/*
 * VM: -Xss160k
 */
public class JavaVMStackSOF {

    private int stackLen = 1;

    public void stackLeak() {
        stackLen++;
        stackLeak();
    }

    public static void main(String[] args) throws Throwable {
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try {
            oom.stackLeak();
        } catch (Throwable e) {
            System.out.println("stack length:" + oom.stackLen);
            throw e;
        }
    }
}
