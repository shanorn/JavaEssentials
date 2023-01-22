/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ejercicio09;

import java.util.Scanner;

/**
 *
 * @author zerox
 */
public class Ejercicio09 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca el radio y la altura separados por un espacio: r h");
        
        double r = s.nextDouble();
        double h = s.nextDouble();
        
        double resultado = (Math.PI * Math.pow(r, 2) * h)/3;
        
        System.out.println("Resultado: " + resultado);
        
    }
}
