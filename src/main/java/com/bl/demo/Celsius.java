/*********************************************************
 * @purpose : Quantity Measurement
 * @author : Vaibhav Patil
 * @date : 18/5/2020
 * *******************************************************/
package com.bl.demo;

import com.bl.demo.model.QuantityUnits;

public class Celsius extends QuantityUnits {
    /**+
     * @purpose : To take temperature input in celsius(double) format and pass it to parent class
     * @param : temperature
     */
    public Celsius(double temperature) {
        super(temperature);
    }
}
