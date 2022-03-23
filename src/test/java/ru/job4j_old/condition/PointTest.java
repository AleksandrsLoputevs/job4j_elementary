package ru.job4j_old.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        double result = Point.distance(25, 25, 50, 50);
        Assert.assertEquals(35.35, result, 0.01);
    }
    @Test
    public void distance1() {
        double result = Point.distance(30,30,90,90);
        Assert.assertEquals(84.85, result,0.01);
    }
    @Test
    public void distance2() {
        double result = Point.distance(15,15,45,60);
        Assert.assertEquals(54.08, result,0.01);
    }
    @Test
    public void distance3(){
        double result = Point.distance(125,115,20,30);
        Assert.assertEquals(135.09,result,0.01);
    }
}