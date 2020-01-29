package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void whenFirstMax() {
        int result = SqMax.max(5, 4, 2, 1);
        assertThat(result, is(5));
    }

    @Test
    public void whenSecondMax() {
        int result = SqMax.max(2, 4, 2, 1);
        assertThat(result, is(4));
    }

    @Test
    public void whenThirdMax() {
        int result = SqMax.max(4, 1, 9, 2);
        assertThat(result, is(9));
    }

    @Test
    public void whenForthMax() {
        int result = SqMax.max(1, 4, 7, 9);
        assertThat(result, is(9));
    }

    @Test
    public void whenThird2Max() {
        int result = SqMax.max(6, 4, 7, 5);
        assertThat(result, is(7));
    }
}
