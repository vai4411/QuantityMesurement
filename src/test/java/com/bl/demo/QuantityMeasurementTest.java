package com.bl.demo;

import com.bl.demo.exception.QuantityMeasurementException;
import com.bl.demo.model.QuantityUnits;
import com.bl.demo.enums.UnitConversion;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    //UC-1
    //TC-1.1
    @Test
    public void givenFeetAndFeet_WhenZero_ShouldReturnTrue() {
        QuantityMeasurement quantity = new QuantityMeasurement();
        QuantityUnits unit1 = new QuantityUnits(UnitConversion.Feet.getUnit(),0);
        QuantityUnits unit2 = new QuantityUnits(UnitConversion.Feet.getUnit(),0);
        Assert.assertTrue(quantity.equals(unit1,unit2));
    }

    //TC-1.2
    @Test
    public void givenFeetAndFeet_WhenOneIsNull_ShouldReturnFalse() {
        QuantityUnits unit1 = null;
        QuantityUnits unit2 = new QuantityUnits(UnitConversion.Feet.getUnit(),0);
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertFalse(quantity.equals(unit1,unit2));
    }

    //TC-1.3
    @Test
    public void givenFeetAndFeet_WhenSameType_ShouldReturnTrue() {
        QuantityUnits unit1 = new QuantityUnits(UnitConversion.Feet.getUnit(),0);
        QuantityUnits unit2 = new QuantityUnits(UnitConversion.Feet.getUnit(),0);
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertTrue(quantity.equals(unit1,unit2));
    }

    //TC-1.4
    @Test
    public void givenFeetAndFeet_WhenSameObject_ShouldReturnTrue() {
        QuantityUnits unit1 = new QuantityUnits(UnitConversion.Feet.getUnit(),0);
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertTrue(quantity.equals(unit1,unit1));
    }

    //TC-1.5
    @Test
    public void givenFeetAndFeet_WhenSameLength_ShouldReturnTrue() {
        QuantityUnits unit1 = new QuantityUnits(UnitConversion.Feet.getUnit(),10);
        QuantityUnits unit2 = new QuantityUnits(UnitConversion.Feet.getUnit(),10);
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertTrue(quantity.equals(unit1,unit2));
    }

    @Test
    public void givenFeetAndFeet_WhenDifferentLength_ShouldReturnFalse() {
        QuantityUnits unit1 = new QuantityUnits(UnitConversion.Feet.getUnit(),0);
        QuantityUnits unit2 = new QuantityUnits(UnitConversion.Feet.getUnit(),10);
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertFalse(quantity.equals(unit1,unit2));
    }

    //UC-2
    //TC-1.6
    @Test
    public void givenInchAndInch_WhenOneIsNull_ShouldReturnFalse() {
        QuantityUnits unit1 = null;
        QuantityUnits unit2 = new QuantityUnits(UnitConversion.Inch.getUnit(),0);
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertFalse(quantity.equals(unit1,unit2));
    }

    //TC-1.7
    @Test
    public void givenInchAndInch_WhenSameType_ShouldReturnTrue() {
        QuantityUnits unit1 = new QuantityUnits(UnitConversion.Inch.getUnit(),0);
        QuantityUnits unit2 = new QuantityUnits(UnitConversion.Inch.getUnit(),0);
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertTrue(quantity.equals(unit1,unit2));
    }

    //TC-1.8
    @Test
    public void givenInchAndInch_WhenSameObject_ShouldReturnTrue() {
        QuantityUnits unit1 = new QuantityUnits(UnitConversion.Inch.getUnit(),0);
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertTrue(quantity.equals(unit1,unit1));
    }

    //TC-1.9
    @Test
    public void givenInchAndInch_WhenSameLength_ShouldReturnTrue() {
        QuantityUnits unit1 = new QuantityUnits(UnitConversion.Inch.getUnit(),10);
        QuantityUnits unit2 = new QuantityUnits(UnitConversion.Inch.getUnit(),10);
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertTrue(quantity.equals(unit1,unit2));
    }

    @Test
    public void givenInchAndInch_WhenDifferentLength_ShouldReturnFalse() {
        QuantityUnits unit1 = new QuantityUnits(UnitConversion.Inch.getUnit(),5);
        QuantityUnits unit2 = new QuantityUnits(UnitConversion.Inch.getUnit(),10);
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertFalse(quantity.equals(unit1,unit2));
    }

    //TC-1.10
    @Test
    public void givenFeetAndInch_WhenZero_ShouldReturnTrue() {
        QuantityUnits unit1 = new QuantityUnits(UnitConversion.Feet.getUnit(),0);
        QuantityUnits unit2 = new QuantityUnits(UnitConversion.Inch.getUnit(),0);
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertTrue(quantity.equals(unit1,unit2));
    }

    //TC-1.11
    @Test
    public void givenFeetAndInch_WhenOne_ShouldReturnFalse() {
        QuantityUnits unit1 = new QuantityUnits(UnitConversion.Feet.getUnit(),1);
        QuantityUnits unit2 = new QuantityUnits(UnitConversion.Inch.getUnit(),1);
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertFalse(quantity.equals(unit1,unit2));
    }

    //TC-1.12
    @Test
    public void givenFeetAndInch_When1FeetCompareWith12Inch_ShouldReturnTrue() {
        QuantityUnits unit1 = new QuantityUnits(UnitConversion.Feet.getUnit(),1);
        QuantityUnits unit2 = new QuantityUnits(UnitConversion.Inch.getUnit(),12);
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertTrue(quantity.equals(unit1,unit2));
    }

    @Test
    public void givenInchAndFeet_WhenNegative_ShouldThrowException() {
        try {
            QuantityMeasurement quantity = new QuantityMeasurement();
            QuantityUnits unit1 = new QuantityUnits(UnitConversion.Feet.getUnit(),-1);
            QuantityUnits unit2 = new QuantityUnits(UnitConversion.Inch.getUnit(),-1);
            boolean result = quantity.equals(unit1,unit2);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals("Quantity Should Be Positive",e.getMessage());
        }
    }

    //TC-1.13
    @Test
    public void givenFeetAndYard_When3FeetCompareWith1Yard_ShouldReturnTrue() {
        QuantityUnits unit1 = new QuantityUnits(UnitConversion.Feet.getUnit(),3);
        QuantityUnits unit2 = new QuantityUnits(UnitConversion.Yard.getUnit(),1);
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertTrue(quantity.equals(unit1,unit2));
    }

    //TC-1.14
    @Test
    public void givenFeetAndYard_WhenOne_ShouldReturnFalse() {
        QuantityUnits unit1 = new QuantityUnits(UnitConversion.Feet.getUnit(),1);
        QuantityUnits unit2 = new QuantityUnits(UnitConversion.Yard.getUnit(),1);
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertFalse(quantity.equals(unit1,unit2));
    }

    //TC-1.15
    @Test
    public void givenInchAndYard_WhenOne_ShouldReturnFalse() {
        QuantityUnits unit1 = new QuantityUnits(UnitConversion.Inch.getUnit(),1);
        QuantityUnits unit2 = new QuantityUnits(UnitConversion.Yard.getUnit(),1);
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertFalse(quantity.equals(unit1,unit2));
    }

    //TC-1.16
    @Test
    public void givenYardAndInch_When1YardCompareWith36Inch_ShouldReturnTrue() {
        QuantityUnits unit1 = new QuantityUnits(UnitConversion.Yard.getUnit(),1);
        QuantityUnits unit2 = new QuantityUnits(UnitConversion.Inch.getUnit(),36);
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertTrue(quantity.equals(unit1,unit2));
    }

    //TC-1.17
    @Test
    public void givenYardAndFeet_When1YardCompareWith3Feet_ShouldReturnTrue() {
        QuantityUnits unit1 = new QuantityUnits(UnitConversion.Feet.getUnit(),3);
        QuantityUnits unit2 = new QuantityUnits(UnitConversion.Yard.getUnit(),1);
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertTrue(quantity.equals(unit1,unit2));
    }

    //UC-3
    @Test
    public void givenInchAndCM_When2InchCompareWith5CM_ShouldReturnTrue() {
        QuantityUnits unit1 = new QuantityUnits(UnitConversion.Centimeter.getUnit(),5);
        QuantityUnits unit2 = new QuantityUnits(UnitConversion.Inch.getUnit(),2);
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertTrue(quantity.equals(unit1,unit2));
    }

    //UC-4
    @Test
    public void givenConversionTest_When2InchAnd2InchAdditionCompareWith4Inch_ShouldReturnTrue() {
        QuantityUnits unit1 = new QuantityUnits(UnitConversion.Inch.getUnit(),2);
        QuantityUnits unit2 = new QuantityUnits(UnitConversion.Inch.getUnit(),2);
        QuantityUnits unit3 = new QuantityUnits(UnitConversion.Inch.getUnit(),4);
        QuantityMeasurement quantity = new QuantityMeasurement();
        double result = quantity.addQuantityUnits(unit1,unit2);
        QuantityUnits unit4 = new QuantityUnits(UnitConversion.Inch.getUnit(),result);
        Assert.assertTrue(quantity.equals(unit3,unit4));
    }

    @Test
    public void givenConversionTest_When1FeetAnd2InchAdditionCompareWith14Inch_ShouldReturnTrue() {
        QuantityUnits unit1 = new QuantityUnits(UnitConversion.Feet.getUnit(),1);
        QuantityUnits unit2 = new QuantityUnits(UnitConversion.Inch.getUnit(),1);
        QuantityUnits unit3 = new QuantityUnits(UnitConversion.Inch.getUnit(),13);
        QuantityMeasurement quantity = new QuantityMeasurement();
        double result = quantity.addQuantityUnits(unit1,unit2);
        QuantityUnits unit4 = new QuantityUnits(UnitConversion.Inch.getUnit(),result);
        Assert.assertTrue(quantity.equals(unit3,unit4));
    }

    @Test
    public void givenConversionTest_When1FeetAnd1FeetAdditionCompareWith24Inch_ShouldReturnTrue() {
        QuantityUnits unit1 = new QuantityUnits(UnitConversion.Feet.getUnit(),1);
        QuantityUnits unit2 = new QuantityUnits(UnitConversion.Feet.getUnit(),1);
        QuantityUnits unit3 = new QuantityUnits(UnitConversion.Inch.getUnit(),24);
        QuantityMeasurement quantity = new QuantityMeasurement();
        double result = quantity.addQuantityUnits(unit1,unit2);
        QuantityUnits unit4 = new QuantityUnits(UnitConversion.Inch.getUnit(),result);
        Assert.assertTrue(quantity.equals(unit3,unit4));
    }

    @Test
    public void givenConversionTest_When2InchAnd2Point5CMAdditionCompareWith3Inch_ShouldReturnTrue() {
        QuantityUnits unit1 = new QuantityUnits(UnitConversion.Inch.getUnit(),2);
        QuantityUnits unit2 = new QuantityUnits(UnitConversion.Centimeter.getUnit(),2.5);
        QuantityUnits unit3 = new QuantityUnits(UnitConversion.Inch.getUnit(),3);
        QuantityMeasurement quantity = new QuantityMeasurement();
        double result = quantity.addQuantityUnits(unit1,unit2);
        QuantityUnits unit4 = new QuantityUnits(UnitConversion.Inch.getUnit(),result);
        Assert.assertTrue(quantity.equals(unit3,unit4));
    }

    //UC-5
    @Test
    public void givenGallonAndLitre_When1GallonCompareWith3Point78Liter_ShouldReturnTrue() {
        QuantityUnits unit1 = new QuantityUnits(UnitConversion.Gallon.getUnit(),1);
        QuantityUnits unit2 = new QuantityUnits(UnitConversion.Litre.getUnit(),3.78);
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertTrue(quantity.equals(unit1,unit2));
    }

    @Test
    public void givenLitreAndML_When1LitreCompareWith1000ML_ShouldReturnTrue() {
        QuantityUnits unit1 = new QuantityUnits(UnitConversion.Litre.getUnit(),1);
        QuantityUnits unit2 = new QuantityUnits(UnitConversion.Millilitre.getUnit(),1000);
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertTrue(quantity.equals(unit1,unit2));
    }

    //UC-6
    @Test
    public void givenConversionTest_When1GallonAnd3Point78LiterAdditionCompareWith7Point56_ShouldReturnTrue() {
        QuantityUnits unit1 = new QuantityUnits(UnitConversion.Gallon.getUnit(),1);
        QuantityUnits unit2 = new QuantityUnits(UnitConversion.Litre.getUnit(),3.78);
        QuantityUnits unit3 = new QuantityUnits(UnitConversion.Litre.getUnit(),7.56);
        QuantityMeasurement quantity = new QuantityMeasurement();
        double result = quantity.addQuantityUnits(unit1,unit2);
        QuantityUnits unit4 = new QuantityUnits(UnitConversion.Litre.getUnit(),result);
        Assert.assertTrue(quantity.equals(unit3,unit4));
    }

    @Test
    public void givenConversionTest_When1LitreAnd1000MLAdditionCompareWith2ML_ShouldReturnTrue() {
        QuantityUnits unit1 = new QuantityUnits(UnitConversion.Litre.getUnit(),1);
        QuantityUnits unit2 = new QuantityUnits(UnitConversion.Millilitre.getUnit(),1000);
        QuantityUnits unit3 = new QuantityUnits(UnitConversion.Litre.getUnit(),2);
        QuantityMeasurement quantity = new QuantityMeasurement();
        double result = quantity.addQuantityUnits(unit1,unit2);
        QuantityUnits unit4 = new QuantityUnits(UnitConversion.Litre.getUnit(),result);
        Assert.assertTrue(quantity.equals(unit3,unit4));
    }

    //UC-7
    @Test
    public void givenKGAndGM_When1KGCompareWith1GM_ShouldReturnTrue() {
        QuantityUnits unit1 = new QuantityUnits(UnitConversion.Kilogram.getUnit(),1);
        QuantityUnits unit2 = new QuantityUnits(UnitConversion.Gram.getUnit(),1000);
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertTrue(quantity.equals(unit1,unit2));
    }

    @Test
    public void givenTonneAndKG_When1TonneCompareWith1000KG_ShouldReturnTrue() {
        QuantityUnits unit1 = new QuantityUnits(UnitConversion.Tonne.getUnit(),1);
        QuantityUnits unit2 = new QuantityUnits(UnitConversion.Kilogram.getUnit(),1000);
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertTrue(quantity.equals(unit1,unit2));
    }

    @Test
    public void givenConversionTest_When1TonneAnd1000GMAdditionCompareWith1001KG_ShouldReturnTrue() {
        QuantityUnits unit1 = new QuantityUnits(UnitConversion.Tonne.getUnit(),1);
        QuantityUnits unit2 = new QuantityUnits(UnitConversion.Gram.getUnit(),1000);
        QuantityUnits unit3 = new QuantityUnits(UnitConversion.Kilogram.getUnit(),1001);
        QuantityMeasurement quantity = new QuantityMeasurement();
        double result = quantity.addQuantityUnits(unit1,unit2);
        QuantityUnits unit4 = new QuantityUnits(UnitConversion.Kilogram.getUnit(),result);
        Assert.assertTrue(quantity.equals(unit3,unit4));
    }

    //UC-8
    @Test
    public void givenFahrenheitAndCelsius_When212FahrenheitCompareWith100Celsius_ShouldReturnTrue() {
        double temperature = QuantityMeasurement.temperatureConversion(UnitConversion.Fahrenheit.getUnit(),100);
        QuantityUnits unit1 = new QuantityUnits(UnitConversion.Celsius.getUnit(),temperature);
        QuantityUnits unit2 = new QuantityUnits(UnitConversion.Fahrenheit.getUnit(), 212);
        QuantityMeasurement quantity = new QuantityMeasurement();
        Assert.assertTrue(quantity.equals(unit1,unit2));
    }
}
