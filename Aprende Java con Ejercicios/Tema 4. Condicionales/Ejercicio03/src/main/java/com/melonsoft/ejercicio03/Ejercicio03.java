/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ejercicio03;

import java.util.Locale;
import java.util.Scanner;

/**
 * Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana.
 * @author zerox
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Introduzca un numero entre [1-7]: ");
        int dia = s.nextInt();
        
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("No es un numero valido.");
        }
    }
}
