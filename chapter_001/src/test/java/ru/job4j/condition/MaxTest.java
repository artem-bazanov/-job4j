package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 5);
        assertThat(result, is(5));
    }
    @Test
    public void whenMax2To2Then1() {
        int result = Max.max(4, 2);
        assertThat(result, is(4));
    }
    @Test
    public void whenMax2To2Then22() {
        int result = Max.max(6, 6);
        assertThat(result, is(6));
    }
    @Test
    public void whenMax2To2Then23() {
        int result = Max.max(6, 4, 2);
        assertThat(result, is(6));
    }
    @Test
    public void whenMax2To2Then24() {
        int result = Max.max(6, 2, 3, 9);
        assertThat(result, is(9));
    }

}
