package com.apollo.test4;

import java.util.ArrayList;
import java.util.List;

public class Main04 {
    public static void main(String[] args) {
        // new SortedSet<>();
        List<Integer> list = new ArrayList<>();
        
    }

    void waitForSignal () throws InterruptedException {
        Object object = new Object();
        synchronized (Thread.currentThread()) {
            object.wait();
            object.notify();
        }
    }
}
