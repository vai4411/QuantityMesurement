/*********************************************************
 * @purpose : Quantity Measurement
 * @author : Vaibhav Patil
 * @date : 18/5/2020
 * *******************************************************/
package com.bl.demo;

import com.bl.demo.model.QuantityUnits;

public class Grams extends QuantityUnits {
    /**+
     * @purpose : To take weight input in grams(double) format and pass it to parent class
     * @param : weight
     */
    public Grams(double weight) {
        super(weight);
    }
}
