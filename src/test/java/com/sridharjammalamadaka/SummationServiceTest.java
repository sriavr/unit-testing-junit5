package com.sridharjammalamadaka;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SummationServiceTest {
    private static List<Integer> numbers;

    @BeforeAll
    private static void initialize() {
        numbers = new ArrayList<>();
    }

    @AfterAll
    private static void tearDown() {
        numbers = null;
    }

    @BeforeEach
    public void runBeforeEachTest(){
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @AfterEach
    public void runAfterEachTest(){
        numbers.clear();
    }

    @Test
    public void givenNumbers_sumEquals_thenCorrect(){
        int sum = numbers.stream().reduce(0, Integer::sum);
        assertEquals(6, sum);
    }
}
