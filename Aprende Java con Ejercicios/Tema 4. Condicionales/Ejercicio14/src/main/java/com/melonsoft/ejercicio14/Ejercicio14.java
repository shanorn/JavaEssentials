/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ejercicio14;

import java.util.Scanner;

/**
 * Realiza un programa que diga si un número introducido por teclado es par y/o
 * divisible entre 5.
 * @author zerox
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduzca un numero: ");
        
        int numero = s.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("Es un numero par.");
        } else {
            System.out.println("Es un numero impar.");
        }
        
        if (numero % 5 == 0) { 
            System.out.println("Es divisible por 5.");
        } else {
            System.out.println("No es divisible por 5.");
        }
    }
}
