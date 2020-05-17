package com.bl.demo;

import com.bl.demo.exception.QuantityMeasurementException;
import com.bl.demo.model.Feet;
import com.bl.demo.model.Inch;
import com.bl.demo.model.Yard;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    //TC-1.1
    @Test
    public void givenFeetAndFeet_WhenZero_ShouldReturnTrue() {
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertTrue(quantity.equals(new Feet(0),new Feet(0)));
    }

    //TC-1.2
    @Test
    public void givenFeetAndFeet_WhenOneIsNull_ShouldReturnFalse() {
        Feet feet = null;
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertFalse(quantity.equals(feet,new Feet(0)));
    }

    //TC-1.3
    @Test
    public void givenFeetAndFeet_WhenSameType_ShouldReturnTrue() {
        Feet one = new Feet(0);
        Feet two = new Feet(0);
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertTrue(quantity.equals(one,two));
    }

    //TC-1.4
    @Test
    public void givenFeetAndFeet_WhenSameObject_ShouldReturnTrue() {
        Feet feet = new Feet(0);
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertTrue(quantity.equals(feet,feet));
    }

    //TC-1.5
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

    //TC-1.6
    @Test
    public void givenInchAndInch_WhenOneIsNull_ShouldReturnFalse() {
        Inch inch = null;
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertFalse(quantity.equals(inch,new Inch(0)));
    }

    //TC-1.7
    @Test
    public void givenInchAndInch_WhenSameType_ShouldReturnTrue() {
        Inch one = new Inch(0);
        Inch two = new Inch(0);
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertTrue(quantity.equals(one,two));
    }

    //TC-1.8
    @Test
    public void givenInchAndInch_WhenSameObject_ShouldReturnTrue() {
        Inch inch = new Inch(0);
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertTrue(quantity.equals(inch,inch));
    }

    //TC-1.9
    @Test
    public void givenInchAndInch_WhenSameLength_ShouldReturnTrue() {
        Inch one = new Inch(10);
        Inch two = new Inch(10);
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertTrue(quantity.equals(one,two));
    }

    @Test
    public void givenInchAndInch_WhenDifferentLength_ShouldReturnFalse() {
        Inch one = new Inch(5);
        Inch two = new Inch(10);
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertFalse(quantity.equals(one,two));
    }

    //TC-1.10
    @Test
    public void givenFeetAndInch_WhenZero_ShouldReturnTrue() {
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertTrue(quantity.equals(new Feet(0),new Inch(0)));
    }

    //TC-1.11
    @Test
    public void givenFeetAndInch_WhenOne_ShouldReturnFalse() {
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertFalse(quantity.equals(new Feet(1),new Inch(1)));
    }

    //TC-1.12
    @Test
    public void givenFeetAndInch_WhenOneFeetAndTwelveInch_ShouldReturnTrue() {
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertTrue(quantity.equals(new Feet(1),new Inch(12)));
    }

    //TC-1.13
    @Test
    public void givenInchAndFeet_WhenTwelveInchAndOneFeet_ShouldReturnTrue() {
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertTrue(quantity.equals(new Feet(1),new Inch(12)));
    }

    @Test
    public void givenInchAndFeet_WhenNegative_ShouldThrowException() {
        try {
            QuantityMeasurement quantity = new QuantityMeasurement();
            boolean result = quantity.equals(new Feet(-1),new Inch(-1));
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals("Length Should Be Positive",e.getMessage());
        }
    }

    //TC-1.14
    @Test
    public void givenFeetAndYard_WhenThreeFeetAndOneYard_ShouldReturnTrue() {
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertTrue(quantity.equals(new Feet(3),new Yard(1)));
    }

    //TC-1.15
    @Test
    public void givenFeetAndYard_WhenOne_ShouldReturnFalse() {
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertFalse(quantity.equals(new Feet(1),new Yard(1)));
    }

    //TC-1.16
    @Test
    public void givenInchAndYard_WhenOne_ShouldReturnFalse() {
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertFalse(quantity.equals(new Inch(1),new Yard(1)));
    }

    //TC-1.17
    @Test
    public void givenYardAndInch_WhenOneYardAndThirtySixInch_ShouldReturnTrue() {
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertTrue(quantity.equals(new Yard(1),new Inch(36)));
    }

    //TC-1.18
    @Test
    public void givenInchAndYard_WhenThirtySixInchAndOneYard_ShouldReturnTrue() {
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertTrue(quantity.equals(new Inch(36),new Yard(1)));
    }

    //TC-1.19
    @Test
    public void givenYardAndFeet_WhenOneYardAndThreeFeet_ShouldReturnTrue() {
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertTrue(quantity.equals(new Yard(1),new Feet(3)));
    }
}
