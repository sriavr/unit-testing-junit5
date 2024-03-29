package com.sridharjammalamadaka;



import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.EnumSet;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParameterizedTest {

    @org.junit.jupiter.params.ParameterizedTest
    @ValueSource(strings = { "Hello", "World" })
    void givenString_TestNullOrNot(String word) {
        assertNotNull(word);
    }

    static Stream<String> wordDataProvider() {
        return Stream.of("foo", "bar");
    }

    @org.junit.jupiter.params.ParameterizedTest
    @MethodSource("wordDataProvider")
    void givenMethodSource_TestInputStream(String argument) {
        assertNotNull(argument);
    }

    @org.junit.jupiter.params.ParameterizedTest
    @CsvSource({ "1, Car", "2, House", "3, Train" })
    void givenCSVSource_TestContent(int id, String word) {
        assertNotNull(id);
        assertNotNull(word);
    }

    @org.junit.jupiter.params.ParameterizedTest
    @EnumSource(value = PizzaDeliveryStrategy.class, names = {"EXPRESS", "NORMAL"})
    void givenEnum_TestContainsOrNot(PizzaDeliveryStrategy timeUnit) {
        assertTrue(EnumSet.of(PizzaDeliveryStrategy.EXPRESS, PizzaDeliveryStrategy.NORMAL).contains(timeUnit));
    }

}
