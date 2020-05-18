/*********************************************************
 * @purpose : Quantity Measurement
 * @author : Vaibhav Patil
 * @date : 18/5/2020
 * *******************************************************/
package com.bl.demo.model;

import static com.bl.demo.model.Conversions.gallonToLitre;

public class Gallon extends QuantityUnits {
    /**+
     * @purpose : To take volume input in gallon(double) format then convert it into litre(double) format and pass it to parent class
     * @param : volume
     */
    public Gallon(double volume) {
        super(gallonToLitre(volume));
    }
}
