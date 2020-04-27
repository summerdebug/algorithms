package com.algorithm.concurrency.waitnotify;

import java.util.concurrent.ThreadLocalRandom;

public class Receiver implements Runnable {

    private Data load;

    public Receiver(Data load) {
        this.load = load;
    }

    @Override
    public void run() {
        String message;
        do {
            message = load.receive();
            System.out.println(message);

            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        } while (!"end".equals(message));
    }
}
