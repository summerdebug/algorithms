package com.algorithm.concurrency;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

public class WaitNotifyTest {

    @Test
    public void testSuccessful() throws Exception {
        // Arrange
        String str = "test";

        // Act
        synchronized (str) {
            str.wait();
        }

        // Assert
    }
}
