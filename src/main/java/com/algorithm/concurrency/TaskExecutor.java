package com.algorithm.concurrency;

import static java.util.concurrent.TimeUnit.SECONDS;

import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class TaskExecutor {

    private final ConcurrentMap<Runnable, Date> tasks = new ConcurrentHashMap<>();
    private final AtomicBoolean stop = new AtomicBoolean(false);

    void start() {
        new Thread(() -> {
            while (!stop.get()) {
                pause();
                pickAndRun();
            }
        }).start();
    }

    private void pickAndRun() {
        Entry<Runnable, Date> entry = getNextTask();
        if (entry != null) {
            tasks.remove(entry.getKey());
            Runnable task = entry.getKey();
            new Thread(task).start();
        }
    }

    private void pause() {
        try {
            SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private Entry<Runnable, Date> getNextTask() {
        Date minDate = new Date();
        Entry<Runnable, Date> result = null;
        for (Map.Entry<Runnable, Date> entry : tasks.entrySet()) {
            if (entry.getValue().before(minDate)) {
                minDate = entry.getValue();
                result = entry;
            }
        }
        return result;
    }

    void stop() {
        stop.set(true);
    }

    void addTask(Runnable task, Date date) {
        tasks.putIfAbsent(task, date);
    }
}
