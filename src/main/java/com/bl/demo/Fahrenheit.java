/*********************************************************
 * @purpose : Quantity Measurement
 * @author : Vaibhav Patil
 * @date : 18/5/2020
 * *******************************************************/
package com.bl.demo;

import com.bl.demo.model.QuantityUnits;

import static com.bl.demo.model.Conversions.fahrenheitToCelsius;

public class Fahrenheit extends QuantityUnits {
    /**+
     * @purpose : To take temperature input in fahrenheit(double) format then convert it into celsius(double) format and pass it to parent class
     * @param : temperature
     */
    public Fahrenheit(double temperature) {
        super(fahrenheitToCelsius(temperature));
    }
}
