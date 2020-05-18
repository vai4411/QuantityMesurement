/*********************************************************
 * @purpose : Quantity Measurement
 * @author : Vaibhav Patil
 * @date : 18/5/2020
 * *******************************************************/
package com.bl.demo.model;

import static com.bl.demo.model.Conversions.feetToInch;
import static com.bl.demo.model.Conversions.yardToFeet;

public class Yard extends QuantityUnits {
    /**+
     * @purpose : To take length input in yard(double) format then convert it into inch(double) format and pass it to parent class
     * @param : length
     */
    public Yard(double length) {
        super(yardToFeet(feetToInch(length)));
    }
}
