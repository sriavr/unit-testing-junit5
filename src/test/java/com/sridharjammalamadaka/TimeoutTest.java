package com.sridharjammalamadaka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

public class TimeoutTest {
    @Test
    public void givenExecution_takeMoreTime_thenFail() throws InterruptedException {
        Assertions.assertTimeout(Duration.ofMillis(1000), () -> Thread.sleep(10000));
    }
}
