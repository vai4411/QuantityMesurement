/*********************************************************
 * @purpose : Quantity Measurement
 * @author : Vaibhav Patil
 * @date : 18/5/2020
 * *******************************************************/
package com.bl.demo.model;

import com.bl.demo.exception.QuantityMeasurementException;

public class QuantityUnits {
    private final double quantity;

    public QuantityUnits(double quantity) {
        this.quantity = quantity;
    }

    /**+
     * @pupose : To take object input and calculate total quantity
     * @param : quantityUnits
     * @return : Give total quantity of object
     */
    public double addLength(QuantityUnits quantityUnits) {
        return quantityUnits.quantity + this.quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        QuantityUnits quantityUnits = (QuantityUnits) o;
        if (quantityUnits.quantity < 0)
            throw new QuantityMeasurementException("Quantity Should Be Positive");
        return quantity == quantityUnits.quantity;
    }
}