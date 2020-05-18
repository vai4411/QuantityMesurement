/*********************************************************
 * @purpose : Quantity Measurement
 * @author : Vaibhav Patil
 * @date : 18/5/2020
 * *******************************************************/
package com.bl.demo.model;

public class Litre extends QuantityUnits {
    /**+
     * @purpose : To take volume input in litre(double) format and pass it to parent class
     * @param : volume
     */
    public Litre(double volume) {
        super(volume);
    }
}
