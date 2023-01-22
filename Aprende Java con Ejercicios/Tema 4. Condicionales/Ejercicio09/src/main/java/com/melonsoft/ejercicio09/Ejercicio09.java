/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ejercicio09;

import java.util.Scanner;

/**
 * Realiza un programa que resuelva una ecuación de segundo grado (del tipo
 * ax2 + bx + c = 0).
 * @author zerox
 */
public class Ejercicio09 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa resuelve ecuaciones de segundo grado del tipo ax2 + bx + c = 0");
        System.out.println("Introduzca los valores de a, b y c separados por espacios");
        
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        
        double x1 = (- b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
        double x2 = (- b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
        
        System.out.println("Soluciones -> x1 = " + x1 + " x2 = " + x2);
    } 
}
