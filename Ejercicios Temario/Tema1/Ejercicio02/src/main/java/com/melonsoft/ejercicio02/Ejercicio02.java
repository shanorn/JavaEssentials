/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ejercicio02;

/**
 *
 * @author zerox
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        /*
        char charMasGrande = 0;
        int contador = 0;
        
        do {
            System.out.println("Actual Char: " + charMasGrande + " [" + contador + "]");
            charMasGrande++;
            contador++;
        } while (charMasGrande != 0);
        
        System.out.println("Max Char: " + charMasGrande + " [" + contador + "]");
        */
        char charMasGrande = Character.MAX_VALUE;
        System.out.println("Max Char: " + (int) (char) (charMasGrande + 0) + " + 1 = " + (int) (char) (charMasGrande + 1));
        short shortMasGrande = Short.MAX_VALUE;
        System.out.println("Max Short: " + (short) shortMasGrande + " + 1 = " + (short) (shortMasGrande + 1));
        int enteroMasGrande = 0b01111111111111111111111111111111;
        enteroMasGrande = Integer.MAX_VALUE;
        System.out.println("Max Entero: " + enteroMasGrande + " + 1 = " + (enteroMasGrande + 1));
        
    }
}
