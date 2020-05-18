package com.bl.demo.model;

public class Conversions {

    public static double feetToInch(double length) {
        return length * 12;
    }

    public static double yardToFeet(double length) {
        return length * 3;
    }

    public static double cmToInch(double length) {
        return length * 2 / 5;
    }

    public static double gallonToLitre(double volume) {
        return volume * 3.78;
    }

    public static double mlToLitre(double volume) {
        return volume / 1000;
    }
}
