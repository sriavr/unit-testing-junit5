package com.sridharjammalamadaka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class GroupTest {

    @Test
    public void shouldAssertAllTheGroup() {
        List<Integer> list = Arrays.asList(1, 2, 4);
        Assertions.assertAll("List is not incremental",
                () -> Assertions.assertEquals(list.get(0).intValue(), 1),
                () -> Assertions.assertEquals(list.get(1).intValue(), 2),
                () -> Assertions.assertEquals(list.get(2).intValue(), 3));
    }

}
