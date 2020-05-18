/*********************************************************
 * @purpose : Quantity Measurement
 * @author : Vaibhav Patil
 * @date : 18/5/2020
 * *******************************************************/
package com.bl.demo.model;

public class Inch extends QuantityUnits {
    /**+
     * @purpose : To take volume input in inch(double) format and pass it to parent class
     * @param : length
     */
    public Inch(double length) {
        super(length);
    }
}