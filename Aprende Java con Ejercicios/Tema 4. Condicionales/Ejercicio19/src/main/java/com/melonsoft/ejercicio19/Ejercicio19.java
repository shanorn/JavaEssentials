/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ejercicio19;

import java.util.Scanner;

/**
 *
 * @author zerox
 */
public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduzca un número entero: ");
        int numero = s.nextInt();
        
        int cantidadDigitos = String.valueOf(numero).length();
        
        System.out.println("El numero: " + numero + " tiene " + cantidadDigitos + " dígitos");
        
        
    }
}
