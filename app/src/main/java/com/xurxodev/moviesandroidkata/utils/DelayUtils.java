package com.xurxodev.moviesandroidkata.utils;

public class DelayUtils {
    public static void simulateDelay(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
