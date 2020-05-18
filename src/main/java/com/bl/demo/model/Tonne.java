/*********************************************************
 * @purpose : Quantity Measurement
 * @author : Vaibhav Patil
 * @date : 18/5/2020
 * *******************************************************/
package com.bl.demo.model;

import static com.bl.demo.model.Conversions.tonneToKilogram;

public class Tonne extends QuantityUnits {
    /**+
     * @purpose : To take weight input in tonne(double) format then convert it into kilograms(double) format and pass it to parent class
     * @param : weight
     */
    public Tonne(double weight) {
        super(tonneToKilogram(weight));
    }
}
