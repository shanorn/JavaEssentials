    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ejercicio01;

import java.util.Locale;
import java.util.Scanner;

/**
 *  
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
 * asignatura toca a primera hora ese día.
 * 
 * @author zerox
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        System.out.println("Introduzca un día de la semana: ");
        Scanner s = new Scanner(System.in).useLocale(Locale.US);
        
        String dia = s.nextLine();
        
        switch (dia) {
            case "Lunes":
                System.out.println("El "+ dia + " a primera hora tienes: BBDD");
                break;
            case "Martes":
                System.out.println("El "+ dia + " a primera hora tienes: Programación");
                break;
            case "Miercoles":
                System.out.println("El "+ dia + " a primera hora tienes: OGE");
                break;
            case "Jueves":
                System.out.println("El "+ dia + " a primera hora tienes: Algebra");
                break;
            case "Viernes":
                System.out.println("El "+ dia + " a primera hora tienes: Análisis y Métodos Numéricos");
                break;
            default:
                if ("Sabado".equals(dia) || "Domingo".equals(dia)) {
                    System.out.println("Hoy es " + dia + "! No tienes clase");
                } else {
                    System.out.println("Eso no es un día de la semana...");
                }
        }
    }
}
