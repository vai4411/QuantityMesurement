/*********************************************************
 * @purpose : Quantity Measurement
 * @author : Vaibhav Patil
 * @date : 18/5/2020
 * *******************************************************/
package com.bl.demo.model;

import static com.bl.demo.model.Conversions.centimeterToInch;

public class CentiMeter extends QuantityUnits {
    /**+
     * @purpose : To take length input in centimeter(double) format then convert it into inch(double) format and pass it to parent class
     * @param : length
     */
    public CentiMeter(double length) {
        super(centimeterToInch(length));
    }
}
