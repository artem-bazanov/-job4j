package ru.job4j.loop;

import org.hamcrest.Matchers;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int fac = Factorial.calc(5);
        int expected = 120;
        assertThat(fac, Matchers.is(expected));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int fac = Factorial.calc(0);
        int expected = 1;
        assertThat(fac, Matchers.is(expected));
    }
}
