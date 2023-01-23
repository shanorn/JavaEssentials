/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ejercicio15;

import java.util.Scanner;

/**
 * Escribe un programa que pinte una pirámide rellena con un carácter introducido
 * por teclado que podrá ser una letra, un número o un símbolo como *, +, -, $, &,
 * etc. El programa debe permitir al usuario mediante un menú elegir si el vértice
 * de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o
 * hacia la derecha
 * @author zerox
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca el carácter con el que desea hacer la piramide: ");
        char caracter = s.next().charAt(0);
        
        System.out.println("Indique hacía dónde quiere que apunte el vertice de la pirámide");
        System.out.println("1. Arriba");
        System.out.println("2. Abajo");
        System.out.println("3. Izquierda");
        System.out.println("4. Derecha");
        
        int opcion = s.nextInt();
        switch (opcion) {
            case 1:
                System.out.println(" " + " " + caracter);
                System.out.println(" " + caracter + caracter + caracter);
                System.out.println("" + caracter + caracter + caracter + caracter + caracter);
                
                break;
            case 2:
                System.out.println("" + caracter + caracter + caracter + caracter + caracter);
                System.out.println(" " + caracter + caracter + caracter);
                System.out.println(" " + " " + caracter);
                break;
            case 3:
                System.out.println("    " + caracter);
                System.out.println("  " + caracter + " " + caracter);
                System.out.println(caracter + " " + caracter + " " + caracter);
                System.out.println("  " + caracter + " " + caracter);
                System.out.println("    " + caracter);
                break;
            case 4:
                System.out.println(caracter + "    ");
                System.out.println(caracter + " " + caracter + "  ");
                System.out.println(caracter + " " + caracter + " " + caracter);
                System.out.println(caracter + " " + caracter + "  ");
                System.out.println(caracter + "    ");
                break;
            default:
                System.out.println("Esta opcion no es valida. ");
        }
        
    }
}
