package com.bl.demo;

import com.bl.demo.model.Feet;
import com.bl.demo.model.Inch;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenFeetAndFeet_WhenZero_ShouldReturnTrue() {
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertTrue(quantity.equals(new Feet(0),new Feet(0)));
    }

    @Test
    public void givenFeetAndFeet_WhenOneIsNull_ShouldReturnFalse() {
        Feet feet = null;
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertFalse(quantity.equals(feet,new Feet(0)));
    }

    @Test
    public void givenFeetAndFeet_WhenSameType_ShouldReturnTrue() {
        Feet one = new Feet(0);
        Feet two = new Feet(0);
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertTrue(quantity.equals(one,two));
    }

    @Test
    public void givenFeetAndFeet_WhenSameObject_ShouldReturnTrue() {
        Feet one = new Feet(0);
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertTrue(quantity.equals(one,one));
    }

    @Test
    public void givenFeetAndFeet_WhenSameLength_ShouldReturnTrue() {
        Feet one = new Feet(10);
        Feet two = new Feet(10);
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertTrue(quantity.equals(one,two));
    }

    @Test
    public void givenFeetAndFeet_WhenDifferentLength_ShouldReturnFalse() {
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertFalse(quantity.equals(new Feet(0),new Feet(10)));
    }

    @Test
    public void givenInchAndInch_WhenOneIsNull_ShouldReturnFalse() {
        Inch inch = null;
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertFalse(quantity.equals(inch,new Inch(0)));
    }

    @Test
    public void givenInchAndInch_WhenSameType_ShouldReturnTrue() {
        Inch one = new Inch(0);
        Inch two = new Inch(0);
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertTrue(quantity.equals(one,two));
    }
}
