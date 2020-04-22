package com.algorithm.concurrency;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.junit.Test;

public class TaskExecutorTest {

    @Test
    public void givenTaskExecutorWhenStartThenSuccessful() throws Exception {
        // Arrange
        Runnable task1 = new TestPrinter(1);
        Runnable task2 = new TestPrinter(2);
        Runnable task3 = new TestPrinter(3);
        Runnable task4 = new TestPrinter(4);
        Runnable task5 = new TestPrinter(5);

        TaskExecutor executor = new TaskExecutor();
        executor.addTask(task1, getDate(1));
        executor.addTask(task2, getDate(2));
        executor.addTask(task3, getDate(3));
        executor.addTask(task4, getDate(4));
        executor.addTask(task5, getDate(10));

        // Act
        executor.start();
        TimeUnit.SECONDS.sleep(20);
        executor.stop();
    }

    private Date getDate(long delay) {
        return new Date(System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(delay));
    }

    class TestPrinter implements Runnable {

        private final int id;

        TestPrinter(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            System.out.println(id + ", " + new Date());
        }
    }
}
