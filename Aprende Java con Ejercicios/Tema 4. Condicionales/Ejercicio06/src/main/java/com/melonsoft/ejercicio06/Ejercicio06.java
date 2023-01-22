/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ejercicio06;

import java.util.Locale;
import java.util.Scanner;

/**
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
 * una altura h. Aplica la fórmula t = √(2g/h) siendo g = 9:81m/s
 * @author zerox
 */
public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in).useLocale(Locale.UK);
        
        final double g = 9.81;
        
        System.out.println("Introduzca la altura para calcular el tiempo de caida: ");
        double h = s.nextDouble();
        
        double t = Math.sqrt(2 * h / g);
        
        System.out.println("El objeto tardará " + t + " s en caer.");
        
               
    }
}
