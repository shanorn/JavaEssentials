/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ejercicio01;

import java.util.Scanner;

/**
 *
 * @author zerox
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int numero1 = s.nextInt();
        System.out.println("Introduzca otro numero: ");
        int numero2 = s.nextInt();
        
        System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
    }
}
