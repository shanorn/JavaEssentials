/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ejercicio04;

import java.util.Scanner;

/**
 *
 * @author zerox
 */
public class Ejercicio04 {

    public static void main(String[] args) {
        System.out.println("Por favor, introzduca dos numeros enteros separados por un espacio: ");
        Scanner s = new Scanner(System.in);
        int numero1 = s.nextInt();
        int numero2 = s.nextInt();
        
        System.out.println("Operaciones:");
        System.out.println("------------");
        System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
        System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
        System.out.println(numero1 + " * " + numero2 + " = " + (numero1 * numero2));
        System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
        System.out.println(numero1 + " % " + numero2 + " = " + (numero1 % numero2));
    }
}
