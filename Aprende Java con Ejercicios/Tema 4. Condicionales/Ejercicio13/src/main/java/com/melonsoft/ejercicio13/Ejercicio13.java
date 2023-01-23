/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ejercicio13;

import java.util.Scanner;

/**
 * Escribe un programa que ordene (de mayor a menor) tres números enteros introducidos por teclado.

 * @author zerox
 */
public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, c; 
        
        System.out.println("Introduzca tres enteros separados por espacios: ");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        
        if (a > b) {
            if (a > c) {
                if (b > c) System.out.println(a + " " + b + " " + c);
                else System.out.println(a + " " + c + " " + b);
            } else {
                System.out.println(c + " " + a + " " + b);
            }
        } else {
            if (b > c) {
                if (a > c) System.out.println(b + " " + a + " " + c);
                else System.out.println(b + " " + c + " " + a);
            } else {
                System.out.println(c + " " + b + " " + a);
            }
        }
    }
}
