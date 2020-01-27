package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void whenFirstMax() {
        int result = SqMax.max(5, 1, 2, 1);
        assertThat(result, is(5));
    }

    @Test
    public void whenSecondMax() {
        int result = SqMax.max(2, 4, 2, 1);
        assertThat(result, is(4));
    }

    @Test
    public void whenThirdMax() {
        int result = SqMax.max(1, 4, 9, 1);
        assertThat(result, is(9));
    }

    @Test
    public void whenForthMax() {
        int result = SqMax.max(1, 4, 7, 8);
        assertThat(result, is(8));
    }
}
