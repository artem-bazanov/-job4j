package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public  void distance () {
        int expected = 1;
        Point a = new Point(0, 0, 1);
        Point b = new Point(0, 0, 2);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public  void distance2 () {
        int expected = 3;
        Point a = new Point(0, 0, 1);
        Point b = new Point(0, 0, 4);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}
