/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ejercicio06;

/**
 *
 * @author zerox
 */
public class Ejercicio06 {

    public static void main(String[] args) {
        float baseImponible = 150;
        float iva = (float) 0.16;
        
        System.out.println("La factura con base imponible "+ baseImponible + " le costará " + (baseImponible + baseImponible * iva));
    }
}
