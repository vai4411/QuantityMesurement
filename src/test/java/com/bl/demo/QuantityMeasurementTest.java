package com.bl.demo;

import com.bl.demo.model.Feet;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenFeetAndFeet_WhenZero_ShouldReturnTrue() {
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertTrue(quantity.equals(new Feet(0),new Feet(0)));
    }

    @Test
    public void givenFeetAndFeet_WhenOneIsZero_ShouldReturnFalse() {
        Feet feet = null;
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertFalse(quantity.equals(feet,new Feet(0)));
    }
}
