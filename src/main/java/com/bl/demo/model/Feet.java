/*********************************************************
 * @purpose : Quantity Measurement
 * @author : Vaibhav Patil
 * @date : 18/5/2020
 * *******************************************************/
package com.bl.demo.model;

import static com.bl.demo.model.Conversions.feetToInch;

public class Feet extends QuantityUnits {
    /**+
     * @purpose : To take length input in feet(double) format and then convert it into inch(double) format and pass it to parent class
     * @param : length
     */
    public Feet(double length) {
        super(feetToInch(length));
    }
}