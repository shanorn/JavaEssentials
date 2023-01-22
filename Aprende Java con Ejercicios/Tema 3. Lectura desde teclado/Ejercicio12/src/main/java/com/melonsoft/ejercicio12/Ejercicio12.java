/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.melonsoft.ejercicio12;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author zerox
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Introduce la nota del primer examen: ");
        double nota = s.nextDouble();
        System.out.println("Introduce la nota deseada: ");
        double deseada = s.nextDouble();
        
        double nota2 = (deseada - nota * 0.4) / 0.6;
        System.out.println("Debes sacar un " + nota2 + " para sacar un " + deseada + ".");
    }
}
