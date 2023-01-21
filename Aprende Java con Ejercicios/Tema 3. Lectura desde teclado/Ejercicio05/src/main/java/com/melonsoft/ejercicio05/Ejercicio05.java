/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ejercicio05;

import java.util.Scanner;

/**
 *
 * @author zerox
 */
public class Ejercicio05 {

    public static void main(String[] args) {
        System.out.println("Introduzca la base y la altura separador por un espacio: b h");
        Scanner s = new Scanner(System.in);
        
        int base = s.nextInt();
        int altura = s.nextInt();
        
        System.out.println("Rectangulo: " + base * altura);
        System.out.println("Triangulo: " + (base * altura)/2);
    }
}
