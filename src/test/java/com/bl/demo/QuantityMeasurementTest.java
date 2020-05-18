package com.bl.demo;

import com.bl.demo.exception.QuantityMeasurementException;
import com.bl.demo.model.*;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    //UC-1
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

    //UC-2
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
    public void givenFeetAndInch_WhenOneFeetCompareWithTwelveInch_ShouldReturnTrue() {
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertTrue(quantity.equals(new Feet(1),new Inch(12)));
    }

    //TC-1.13
    @Test
    public void givenInchAndFeet_WhenTwelveInchCompareWithOneFeet_ShouldReturnTrue() {
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
    public void givenFeetAndYard_WhenThreeFeetCompareWithOneYard_ShouldReturnTrue() {
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
    public void givenYardAndInch_WhenOneYardCompareWithThirtySixInch_ShouldReturnTrue() {
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertTrue(quantity.equals(new Yard(1),new Inch(36)));
    }

    //TC-1.18
    @Test
    public void givenInchAndYard_WhenThirtySixInchCompareWithOneYard_ShouldReturnTrue() {
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertTrue(quantity.equals(new Inch(36),new Yard(1)));
    }

    //TC-1.19
    @Test
    public void givenYardAndFeet_WhenOneYardCompareWithThreeFeet_ShouldReturnTrue() {
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertTrue(quantity.equals(new Yard(1),new Feet(3)));
    }

    //UC-3
    @Test
    public void givenInchAndCM_WhenTwoInchCompareWithFiveCM_ShouldReturnTrue() {
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertTrue(quantity.equals(new Inch(2),new CM(5)));
    }

    //UC-4
    @Test
    public void givenConversionTest_WhenTwoInchAndTwoInchAdditionCompareWithFourInch_ShouldReturnTrue() {
        QuantityMeasurement quantity = new QuantityMeasurement();
        double result = quantity.addLengthUnits(new Inch(2),new Inch(2));
        Assert.assertTrue(quantity.equals(new Inch(4),new Inch(result)));
    }

    @Test
    public void givenConversionTest_WhenOneFeetAndTwoInchAdditionCompareWithFourteenInch_ShouldReturnTrue() {
        QuantityMeasurement quantity = new QuantityMeasurement();
        double result = quantity.addLengthUnits(new Feet(1),new Inch(1));
        Assert.assertTrue(quantity.equals(new Inch(13),new Inch(result)));
    }

    @Test
    public void givenConversionTest_WhenOneFeetAndOneFeetAdditionCompareWithTwentyFourInch_ShouldReturnTrue() {
        QuantityMeasurement quantity = new QuantityMeasurement();
        double result = quantity.addLengthUnits(new Feet(1),new Feet(1));
        Assert.assertTrue(quantity.equals(new Inch(24),new Inch(result)));
    }

    @Test
    public void givenConversionTest_WhenTwoInchAndTwoPointFiveCMAdditionCompareWithThreeInch_ShouldReturnTrue() {
        QuantityMeasurement quantity = new QuantityMeasurement();
        double result = quantity.addLengthUnits(new Inch(2),new CM(2.5));
        Assert.assertTrue(quantity.equals(new Inch(3),new Inch(result)));
    }

    //UC-5
    @Test
    public void givenGallonAndLitre_WhenOneGallonCompareWithThreePointSeventyEightLiter_ShouldReturnTrue() {
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertTrue(quantity.equals(new Gallon(1),new Litre(3.78)));
    }

    @Test
    public void givenLitreAndML_WhenOneLitreCompareWithThousandML_ShouldReturnTrue() {
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertTrue(quantity.equals(new Litre(1),new ML(1000)));
    }
}
