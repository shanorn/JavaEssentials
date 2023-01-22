/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ejercicio08;

import java.util.Scanner;

/**
 *
 * @author zerox
 */
public class Ejercicio08 {

    public static void main(String[] args) {
        double precioHora = 12;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduzca el numero de horas trabajadas esta semana: ");
        
       double horasSemana = s.nextDouble();
        
        System.out.println("Salario semanal: " + (horasSemana * precioHora));
               
    }
}
