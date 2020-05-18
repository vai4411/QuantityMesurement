/*********************************************************
 * @purpose : Quantity Measurement
 * @author : Vaibhav Patil
 * @date : 18/5/2020
 * *******************************************************/
package com.bl.demo.model;

import com.bl.demo.model.QuantityUnits;

import static com.bl.demo.model.Conversions.millilitreToLitre;

public class MilliLitre extends QuantityUnits {
    /**+
     * @purpose : To take volume input in milliLitre(double) format then convert it into litre(double) format and pass it to parent class
     * @param : volume
     */
    public MilliLitre(double volume) {
        super(millilitreToLitre(volume));
    }
}
