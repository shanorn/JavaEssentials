/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ejercicio04;

import java.util.Locale;
import java.util.Scanner;

/**
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
 * las horas extras. Escribe un programa que calcule el salario semanal de un
 * trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
 * trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
 * la hora.
 * @author zerox
 */
public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Introduzca el numero de horas trabajadas en la semana: ");
        int totalHoras = s.nextInt();
        
        if (totalHoras <= 40) { 
            System.out.println("Salario semanal: " + totalHoras * 12 + " €");
        } else { 
            int horasExtra = totalHoras - 40;
            System.out.println("Salario semanal: " + 40 * 12 + " + " + horasExtra * 16 + " = " + (40 * 12 + horasExtra * 16));
        }
    }
}
