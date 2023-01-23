/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ejercicio18;

import java.util.Scanner;

/**
 * Escribe un programa que diga cuál es la primera cifra de un número entero
 * introducido por teclado.
 * @author zerox
 */
public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduzca un número entero: ");
        int numero = s.nextInt();
        
        int primerDigito = Integer.parseInt(String.valueOf(numero).substring(0, 1));
        
        System.out.println("El primer dígito de: " + numero + " es " + primerDigito);
    }
}
