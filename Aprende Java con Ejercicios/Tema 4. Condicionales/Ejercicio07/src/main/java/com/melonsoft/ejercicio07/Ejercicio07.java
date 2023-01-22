/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ejercicio07;

import java.util.Scanner;

/** 
 * Realiza un programa que calcule la media de tres notas.
 * @author zerox
 */
public class Ejercicio07 {

    public static void main(String[] args) {
        
        double nota1, nota2, nota3;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduzca tres notas separadas por espacios: ");
        nota1 = s.nextDouble();
        nota2 = s.nextDouble();
        nota3 = s.nextDouble();
        
        System.out.println("La media es: " + (nota1 + nota2 + nota3)/3);
    }
}
