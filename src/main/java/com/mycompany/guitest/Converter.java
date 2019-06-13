/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.guitest;

/**
 *
 * @author Viet Dung
 */
public class Converter {
    public static float convertCelsiusToFahrenheit(float CelsiusDegree) {
        float FahrenheitDegree = (float) (CelsiusDegree * 1.8 + 32);
        return FahrenheitDegree;
    }
    
    public static float convertFahrenheitToCelsius(float FahrenheitDegree) {
        float CelsiusDegree = (float) ((FahrenheitDegree - 32) / 1.8);
        return CelsiusDegree;
    }
}
