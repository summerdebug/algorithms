package com.algorithm.concurrency.waitnotify;

public class Sender implements Runnable {

    private Data data;

    public Sender(Data data) {
        this.data = data;
    }

    @Override
    public void run() {

        String packets[] = {"First", "Second", "Third", "Forth", "end"};
        for (String packet : packets) {
            data.send(packet);
            try {
                Thread.sleep(1000, 5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
    }
}
