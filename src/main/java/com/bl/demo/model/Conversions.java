/*********************************************************
 * @purpose : Quantity Measurement
 * @author : Vaibhav Patil
 * @date : 18/5/2020
 * *******************************************************/
package com.bl.demo.model;

public class Conversions {

    /**+
     * @purpose : To take input in feet(double) and convert it into inch(double)
     * @param : length
     * @return : Give the result in inch(double) format
     */
    public static double feetToInch(double length) {
        return length * 12;
    }

    /**+
     * @purpose : To take input in Yard(double) and convert it into Feet(double)
     * @param : length
     * @return : Give the result in Feet(double) format
     */
    public static double yardToFeet(double length) {
        return length * 3;
    }

    /**+
     * @purpose : To take input in centimeter(double) and convert it into inch(double)
     * @param : length
     * @return : Give the result in inch(double) format
     */
    public static double centimeterToInch(double length) {
        return length * 2 / 5;
    }

    /**+
     * @purpose : To take input in gallon(double) and convert it into litre(double)
     * @param : volume
     * @return : Give the result in litre(double) format
     */
    public static double gallonToLitre(double volume) {
        return volume * 3.78;
    }

    /**+
     * @purpose : To take input in millilitre(double) and convert it into litre(double)
     * @param : volume
     * @return : Give the result in litre(double) format
     */
    public static double millilitreToLitre(double volume) {
        return volume / 1000;
    }

    /**+
     * @purpose : To take input in kilograms(double) and convert it into grams(double)
     * @param : weight
     * @return : Give the result in grams(double) format
     */
    public static double gramToKilogram(double weight) {
        return weight / 1000;
    }

    /**+
     * @purpose : To take input in tonne(double) and convert it into kilograms(double)
     * @param : weight
     * @return : Give the result in kilograms(double) format
     */
    public static double tonneToKilogram(double weight) {
        return weight * 1000;
    }

    /**+
     * @purpose : To take input in fahrenheit(double) and convert it into celsius(double)
     * @param : temperature
     * @return : Give the result in celsius(double) format
     */
    public static double fahrenheitToCelsius(double temperature) {
        return (temperature - 32) * 5 / 9;
    }
}
