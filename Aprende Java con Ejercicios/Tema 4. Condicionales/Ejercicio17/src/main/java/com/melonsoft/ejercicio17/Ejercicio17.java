/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ejercicio17;

import java.util.Scanner;

/**
 * Escribe un programa que diga cuál es la última cifra de un número entero
 * introducido por teclado.
 * @author zerox
 */
public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduzca un número entero: ");
        int numero = s.nextInt();
        
        int ultimoDigito = Integer.parseInt(String.valueOf(numero).substring(String.valueOf(numero).length() - 1));
        
        System.out.println("El último dígito de: " + numero + " es " + ultimoDigito);
    }
}
