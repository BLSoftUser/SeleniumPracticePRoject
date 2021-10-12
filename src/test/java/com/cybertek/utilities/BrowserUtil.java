package com.cybertek.utilities;

public class BrowserUtil {

    /**
     * a method to pause the Thread  for a specific amount of seconds
     * @param seconds
     */

    public static void waitFor(int seconds){

        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
