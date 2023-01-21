/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ejercicio07;

import java.util.Scanner;

/**
 *
 * @author zerox
 */
public class Ejercicio07 {

    public static void main(String[] args) {
        System.out.println("Por favor introduzca la base imponible: ");
        Scanner s = new Scanner(System.in);
        
        double baseImponible = s.nextDouble();
        double iva = 0.16;
        
        System.out.println("El valor de su factura + IVA: " + (baseImponible + baseImponible * iva));
    }
}
