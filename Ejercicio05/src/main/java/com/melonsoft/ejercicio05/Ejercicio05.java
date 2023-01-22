/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ejercicio05;

import java.util.Locale;
import java.util.Scanner;

/**
 * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b =
 * 0).
 * @author zerox
 */
public class Ejercicio05 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.println("Por favor introduzca el valor de a: ");
        int a = s.nextInt();
        System.out.println("Ahora introduzca el valor de b: ");
        int b = s.nextInt();
        
        if ( a != 0 ) {
            double x = (- (double) b) / (double) a;
        
            System.out.printf("El resultado es: %.1f\n", x);
        }
        System.out.println("Esta ecuación no tiene solución real");
    }
}
